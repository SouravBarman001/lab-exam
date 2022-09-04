package designpatternlabexam.question1;

public class ReturnPolicyVisitor implements ProductVisitor{
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
