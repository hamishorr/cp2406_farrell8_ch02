import javax.swing.JOptionPane;
public class InchesToFeetInteractive extends Unit{
    public static void main(String args[]) {
        Unit unit = new Unit();
        unit.name = "Inches";
        unit.amount = Double.parseDouble(JOptionPane.showInputDialog("Number of " + unit.name +":"));
        Double originalAmount = unit.amount;
        String originalUnitName = unit.name;
        unit.convert("Feet", 1 / 12.0);

        JOptionPane.showMessageDialog(null, "There are " + String.format("%.2f",
                unit.amount) + " " + unit.name + " in " + String.format("%.2f", originalAmount) +
                " " + originalUnitName);
    }}