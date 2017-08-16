public class InchesToFeet extends Unit{
    public static void main(String args[]) {
        Unit unit = new Unit();
        unit.name = "Inches";
        unit.amount = 30.0;
        unit.convert("Feet",1/12.0);

        System.out.println(unit.amount + " " + unit.name);
    }};