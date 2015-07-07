public class CustomerLargeYard implements Yard
{
   String myFirstName, myLastName;
   int mySize;
   
   public CustomerLargeYard()
   {
      myFirstName = "";
      myLastName = "";
      mySize = 0;
   }
   
   public CustomerLargeYard(String lastName, String firstName, int size)
   {
      myFirstName = firstName;
      myLastName = lastName;
      mySize = size;
   }
   
   public double getCost()
   {
      return mySize * 0.003;
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