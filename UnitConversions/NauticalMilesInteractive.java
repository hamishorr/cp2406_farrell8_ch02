import javax.swing.JOptionPane;
public class NauticalMilesInteractive {
    public static void main(String args[]){
        String inputNauticalMiles = JOptionPane.showInputDialog("Enter number of nautical miles:");
        Double Miles = 1.150779*Double.parseDouble(inputNauticalMiles);
        Double Kilometers = 1.852*Double.parseDouble(inputNauticalMiles);
        JOptionPane.showMessageDialog(null, inputNauticalMiles +
                " nautical miles is equal to " + String.format("%.2f", Miles) + " miles and " + String.format("%.2f", Kilometers) +" kilometers");
    }
}
