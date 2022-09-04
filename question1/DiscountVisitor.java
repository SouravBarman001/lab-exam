package designpatternlabexam.question1;

public class DiscountVisitor implements ProductVisitor{

    int eletronicItem = 60;
    int plasticItem = 30;
    int vegetableItem = 0;


    @Override
    public DiscountVisitor visit(DiscountVisitor discountVisitor) {
        return 0;
    }

    @Override
    public ReturnPolicyVisitor visit(ReturnPolicyVisitor returnPolicyVisitor) {
        return 0;
    }

    @Override
    public int visit(ShippingVendorVisitor shippingVendorVisitor) {
        return 0;
    }
}
