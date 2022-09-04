package designpatternlabexam.question2;

import static java.lang.System.exit;

public class CentralDatabase {

    CentralDatabase(String debitCard,int amount){

        if (debitCard.matches("^[0-9]+(-[0-9]+)+$")){
            System.out.println("Central Database : "+amount+" taka can be withdrawn");

        }
        else {
            System.out.println("please enter valid card");
            exit(0);
        }
    }

}
