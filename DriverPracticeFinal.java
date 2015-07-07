import javax.swing.JFrame;
public class DriverPracticeFinal 
{
   private static JFrame frame, test;
   public static void main(String[] args)
   {
      frame = new JFrame("Sample Final Exam");
      frame.setSize(415,510);
      frame.setLocation(200,80);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new PanelSampleYard());
      frame.setVisible(true);
   }
   public void test(){
      frame.setVisible(false);         
   }
}