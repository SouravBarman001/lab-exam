package designpatternlabexam.question1;

public class main {
    public static void main(String[] args) {
     ProductVisitor discountVisitor = new DiscountVisitor();
     ProductVisitor returnVisitor = new ReturnPolicyVisitor();
     ProductVisitor shippingVisitor = new ShippingVendorVisitor();



     ProductCategory plastic = new Plastic();
     plastic.getName();
     plastic.
    }
}
