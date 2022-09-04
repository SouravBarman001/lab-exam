package designpatternlabexam.question2;

public class DebitCard {

    String debitCard;
    int amount;
    CentralDatabase centralDatabase;
    AmountCalculator amountCalculator;
    LEDScreen ledScreen;
    ReceiptPrinter receiptPrinter;

    DebitCard(String debitCard){
        this.debitCard =debitCard;

    }
    public void withdraw(int amount){
        centralDatabase = new CentralDatabase(amount);
        amountCalculator = new AmountCalculator(amount);
        ledScreen = new LEDScreen();
        receiptPrinter = new ReceiptPrinter(debitCard,amount);
    }



}
