package designpatternlabexam.question1;

public class Plastic implements ProductCategory,ProductVisitor{
    @Override
    public void getName() {
        System.out.println("Category Name: Plastic");
    }

    @Override
    public DiscountVisitor visit(DiscountVisitor discountVisitor) {
        return new DiscountVisitor();
    }

    @Override
    public ReturnPolicyVisitor visit(ReturnPolicyVisitor returnPolicyVisitor) {
        return new ReturnPolicyVisitor();
    }

    @Override
    public ShippingVendorVisitor visit(ShippingVendorVisitor shippingVendorVisitor) {
        return new ShippingVendorVisitor();
    }
}
