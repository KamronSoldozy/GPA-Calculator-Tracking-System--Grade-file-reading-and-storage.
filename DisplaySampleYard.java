import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

public class DisplaySampleYard extends JPanel
{
   private Scanner infile;
   private static Yard[] myArray; 
   private static JTextField box1, box2, box3, box4, box5;
   private String first, last;
   private  static int size, number, total, numitems;
   public DisplaySampleYard()
   {
      number = total = 0;
      setLayout(new GridLayout(5, 2));
      
      add(new JLabel("Last Name:", SwingConstants.LEFT));
      box1 = new JTextField("", 5);
      add(box1);
      
      add(new JLabel("First Name:", SwingConstants.LEFT));
      box2 = new JTextField("", 5);
      add(box2);
      
      add(new JLabel("Lawn Size:", SwingConstants.LEFT));
      box3 = new JTextField("", 5);
      add(box3);
      
      add(new JLabel("Total Cost:", SwingConstants.LEFT));
      box4 = new JTextField("", 5);
      add(box4);
      
      add(new JLabel("Running Total:", SwingConstants.LEFT));
      box5 = new JTextField("", 5);
      add(box5);
      
      String file = JOptionPane.showInputDialog("Enter a file");
      readInfo(file);
      sort(myArray);
   }
   
   public Yard[] readInfo(String myFile)
   {
      myArray = null;
      try
      { 
         infile = new Scanner(new File(myFile));
         numitems = Integer.parseInt(infile.nextLine());
         myArray = new Yard[numitems];
         for(int x = 0; x < numitems; x++)
         {
            last = infile.nextLine();
            first = infile.nextLine();
            size = Integer.parseInt(infile.nextLine());
            if(size <= 10000)
               myArray[x] = new CustomerSmallYard(last, first, size);
            else if(size <= 20000)
               myArray[x] = new CustomerMediumYard(last, first, size);
            else
               myArray[x] = new CustomerLargeYard(last, first, size);
         }
      }
      catch(FileNotFoundException e)
      {
         System.out.println("Sorry, this file wasn't found");
         String file = JOptionPane.showInputDialog("Enter a legitimate file");
         readInfo(file);
      }
      return myArray;
   }
   
   public static void sort(Yard[] array)
   {
      int maxPos;
      for(int k = 0; k < array.length; k++)
      {
         maxPos = findMax(array, array.length - k);
         swap(array, maxPos, array.length - k - 1);
      }
   }
   
   public static int findMax(Yard[] array, int upper) 
   {
      int maxPosition = 0;
      for(int x = 0; x < upper; x++)
      {
         if(array[x].compareTo(array[maxPosition]) > 0)
         {
            maxPosition = x;
         }
      }
      return maxPosition;
   }
   
   public static void swap(Yard[] array, int a, int b)
   {
      Yard temp = array[a];
      array[a] = array[b];
      array[b] = temp;
   }
   
   public static void goNext()
   {
      if(number >= numitems)
         System.out.println("Nope bruh");
      else
      {
         box1.setText(myArray[number].getLastName());
         box2.setText(myArray[number].getFirstName());
         box3.setText("" + myArray[number].getSize());
         box4.setText("$" + myArray[number].getCost() + "0");
         total += myArray[number].getCost();
         box5.setText("$" + total + ".00");
         number++;
      }
   }
}