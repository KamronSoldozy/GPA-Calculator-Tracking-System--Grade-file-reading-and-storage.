public class CustomerMediumYard implements Yard
{
   String myFirstName, myLastName;
   int mySize;
   
   public CustomerMediumYard()
   {
      myFirstName = "";
      myLastName = "";
      mySize = 0;
   }
   
   public CustomerMediumYard(String lastName, String firstName, int size)
   {
      myFirstName = firstName;
      myLastName = lastName;
      mySize = size;
   }
   
   public double getCost()
   {
      return mySize * 0.004;
   }
   
   public int getSize()
   {
      return mySize;
   }
   
   public String getFirstName()
   {
      return myFirstName;
   }
   
   public String getLastName()
   {
      return myLastName;
   }
   
   public int compareTo(Yard y)
   {
      return myLastName.compareTo(y.getLastName());
   }
   
   public String toString()
   {
      return "";
   }
}