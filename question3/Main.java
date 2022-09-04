package designpatternlabexam.question3;

public class Main {
    public static void main(String[] args) {

        Computer pc1 = ComputerFactory.getComputer("lab-2");
        pc1.config();

        System.out.println("----------------");

        Computer pc2 = ComputerFactory.getComputer("lab-4");
        pc2.config();
    }
}
