import javax.swing.JOptionPane;
public class DebugTwo4
{
   public static void main(String[] args)
   {
      String costString = JOptionPane.showInputDialog("Enter price of item you are buying");
      final double tax = 0.06;
      double cost = Double.parseDouble(costString);
      JOptionPane.showMessageDialog(null,"With " + tax * 100 +
         "% tax,  purchase  is $" + (cost + cost * tax));
   }
}
