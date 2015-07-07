import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
public class PanelSampleYard extends JPanel
{
   private DriverPracticeFinal finals;
   private DisplaySampleYard display;
   private JFrame test;
   private JButton next, track;
   public PanelSampleYard()
   {
      JPanel subpanel=new JPanel();
      subpanel.setLayout(new FlowLayout());
      setLayout(new BorderLayout());
      
      JLabel company = new JLabel("GPA Grade Tracker", SwingConstants.CENTER);
      subpanel.add(company, BorderLayout.NORTH);
      
      JLabel credit=new JLabel("Kamron Soldozy", SwingConstants.CENTER);
      subpanel.add(credit, BorderLayout.NORTH);
      add(subpanel, BorderLayout.NORTH);
      ImageIcon image = new ImageIcon("C:/Users/Kamron/Desktop/School/Com Sci/Com Sci Files/Unit5/Sample Exam/GPA Calculator/gpa.png");
      JLabel gez=new JLabel(image, SwingConstants.CENTER);
      add(gez, BorderLayout.CENTER);
      
      display = new DisplaySampleYard();
   
      
      JPanel south = new JPanel(new FlowLayout());
      next = new JButton("Final GPA Calculator");
      next.addActionListener(new NextListener());
      south.add(next);
      
      track = new JButton("Track a class grade");
      track.addActionListener(new TrackListener());
      south.add(track);
      
      JButton quit = new JButton("Quit");
      quit.addActionListener(new QuitListener());
      south.add(quit);
      
      add(south, BorderLayout.SOUTH);
   }
   private class NextListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         finals= new DriverPracticeFinal();
         finals.test();   
         next.setEnabled(false);   
         test=new JFrame("Calculatre your GPA! Kamron Soldozy");
         test.setSize(490,510);
         test.setLocation(200,80);
         test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         test.setContentPane(new PanelSampleYarddos());
         test.setVisible(true);
                   
      }
   }
   private class TrackListener implements ActionListener{
      public void actionPerformed(ActionEvent e){
         System.exit(0);
      }
   }

   private class QuitListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
          
         System.exit(0);
      }
   }
}