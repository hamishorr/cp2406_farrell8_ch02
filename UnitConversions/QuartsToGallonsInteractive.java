import javax.swing.JOptionPane;
public class QuartsToGallonsInteractive{
    public static void main(String args[]){
        String inputGallons = JOptionPane.showInputDialog("Enter amount of gallons:");
        double Quarts = Double.parseDouble(inputGallons)*4;
        JOptionPane.showMessageDialog(null, inputGallons +
                " gallons is equal to " + Quarts + " quarts");
    }
}