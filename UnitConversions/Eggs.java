import javax.swing.*;

public class Eggs {
    public static void main(String Args[]){
    Double pricePerDozen = 3.25;
    Double pricePerEgg = 0.45;
    int eggs = Integer.parseInt(JOptionPane.showInputDialog("number of eggs:"));
    int looseEggs = eggs%12;
    int dozenEggs = (eggs-looseEggs)/12;

    JOptionPane.showMessageDialog(null, "That's " + dozenEggs + " dozen eggs" +
            " at $" + pricePerDozen + " per dozen and " + looseEggs + " loose eggs" +
            " at $" + pricePerEgg + " per egg totalling $" + String.format("%.2f", (pricePerDozen*dozenEggs + pricePerEgg*looseEggs)));

    }
}
