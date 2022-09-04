package designpatternlabexam.question2;

public class ReceiptPrinter {
    ReceiptPrinter(String debitCard,int amount){
        System.out.println("Receipt printer : "+amount+"taka has been seducted from "+debitCard);
    }
}
