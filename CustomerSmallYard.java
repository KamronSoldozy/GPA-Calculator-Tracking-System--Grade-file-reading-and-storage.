public class CustomerSmallYard implements Yard
{
   String myFirstName, myLastName;
   int mySize;
   
   public CustomerSmallYard()
   {
      myFirstName = "";
      myLastName = "";
      mySize = 0;
   }
   
   public CustomerSmallYard(String lastName, String firstName, int size)
   {
      myFirstName = firstName;
      myLastName = lastName;
      mySize = size;
   }
   
   public double getCost()
   {
      return mySize * 0.005;
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