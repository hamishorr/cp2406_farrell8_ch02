public class Initials {
    public static void main(String args[]){
        String name = "Hamish Bruce Kelvin Orr";
        String initials = "" + name.charAt(0); //first character is is the first initial
        for(int i = 1; i < name.length(); i = i + 1){ //starts at second character
        if(Character.isUpperCase(name.charAt(i))){
            initials = initials + "." + name.charAt(i);
        }//end if
        }//end for
        System.out.println(initials);;
        }
    }
