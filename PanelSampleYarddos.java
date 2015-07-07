import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PanelSampleYarddos extends JPanel
{
   private DisplaySampleYard display;
   private JButton next;
   public PanelSampleYarddos()
   {
      setLayout(new BorderLayout());
      
      JLabel company = new JLabel("SWAGDOZY", SwingConstants.CENTER);
      add(company, BorderLayout.NORTH);
      
      display = new DisplaySampleYard();
   
      
      JPanel south = new JPanel(new FlowLayout());
      next = new JButton("Start");
      next.addActionListener(new NextListener());
      south.add(next);
      
      JButton quit = new JButton("Quit");
      quit.addActionListener(new QuitListener());
      south.add(quit);
      
      add(south, BorderLayout.SOUTH);
   }
   private class NextListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         add(display, BorderLayout.CENTER);
         next.setEnabled(false);
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