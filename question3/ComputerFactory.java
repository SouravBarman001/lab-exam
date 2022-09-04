package designpatternlabexam.question3;

public class ComputerFactory {
    public static Computer getComputer(String str){

        if (str.equalsIgnoreCase("lab-1")){
            return new Lab_1();
        }
        else if (str.equalsIgnoreCase("Lab-2")){
            return new Lab_2();
        }
        else if (str.equalsIgnoreCase("Lab-3")){
            return new Lab_3();
        }
        else if (str.equalsIgnoreCase("Lab-4")){
            return new Lab_4();
        }
        return null;
    }
}
