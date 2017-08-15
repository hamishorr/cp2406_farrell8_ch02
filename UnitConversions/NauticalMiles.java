import javax.swing.JOptionPane;
public class NauticalMiles {
    public static void main(String args[]){
        Double inputNauticalMiles = 30.0;
        Double Miles = 1.150779*inputNauticalMiles;
        Double Kilometers = 1.852*inputNauticalMiles;
        JOptionPane.showMessageDialog(null, inputNauticalMiles +
         " nautical miles is equal to " + Miles + " miles and " + Kilometers +" kilometers");
    }
}
