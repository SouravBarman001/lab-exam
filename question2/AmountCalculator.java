package designpatternlabexam.question2;

import static java.lang.System.exit;

public class AmountCalculator {
int amount;
    AmountCalculator(int amount){

        if (amount < 20000){
            System.out.println("Amount Calculator:"+amount+" taka has been debited");

        }
        else {
            System.out.println("Please withdraw amount less than 20000");
            exit(0);
        }
    }
}
