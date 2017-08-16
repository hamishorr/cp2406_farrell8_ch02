public class Unit {
    Double amount;
    String name;

    public void convert(String newUnitName, Double convertFactor){
        amount = convertFactor*amount;
        name = newUnitName;

    }
};
