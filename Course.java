/*
Darby Lane
CS 2100 Section A
This is the Course class, and it implements the Comparable interface.
*/
public class Course implements Comparable<Course>
{
   //general question, how does making classes for exceptions work? is it just to personalize how they are handled beyond the default way?
   //also ask about lists versus arrays
   
   //instance variables
   private String subject;
   private int number;
   private String title;
   private int crn;
   private String section;
   private String instructor;
   
   /*
   This is the constructor for the Course class
   @param String for the subject
   @param int for the number
   @param String for title
   @param int for the crn
   @param String for the section
   @param String for the instructor
   */
   //constructor
   public Course(String subject, int number, String title, int crn, String section, String instructor)
   {
      this.subject = subject;
      this.number = number;
      this.title = title;
      this.crn = crn;
      this.section = section;
      this.instructor = instructor;//only store last name, that's how the toString only prints last name, 
      //but also how do i get rid of quotation in front? i could use substring method, is there a better way?
      //substring(1)
   }
   
   /*
   getCrn returns the int attached to crn
   @return returns an int
   */
   //methods
   public int getCrn()
   {
      return crn;
   }
   
   /*
   toString prints a formatted String for a Course object
   @return returns a formatted String
   */
   @Override
   public String toString()
   {
      return String.format("%s %d %s %d %s %s", subject, number, title, crn, section, instructor);
   }
   
   /* 
   equals checks if two Course objects are equal if they have the same crn number
   @return returns true if they have the same crn, false otherwise
   */
   @Override
   public boolean equals(Object obj)
   {
      if (obj == null)
      {
         return false;
      }
      else
      {
         Course cObj = (Course)obj;
         
         return (this.crn==cObj.crn);
      }
   }
   
   /* 
   compareTo compares two Course objects
   @return returns 1 if main object has a bigger crn than param object, -1 of switched, and 0 if they're the same
   @param takes a Course object
   */
   @Override
   public int compareTo(Course course)
   {
      if (course.crn < this.crn)
      {
         return 1;
      }
      
      else if (course.crn == this.crn)
      {
         return 0;
      }
      
      else
      {
         return -1;
      }
   }
   
}