public class Unit {
    Double amount;
    String name;

    public void convert(String outputUnitName, Double convertFactor){
        amount = convertFactor*amount;
        name = outputUnitName;

    }
};
