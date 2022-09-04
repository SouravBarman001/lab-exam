package designpatternlabexam.question1;

public interface ProductVisitor {

    DiscountVisitor visit(DiscountVisitor discountVisitor);
    ReturnPolicyVisitor visit(ReturnPolicyVisitor returnPolicyVisitor);
    int visit(ShippingVendorVisitor shippingVendorVisitor);
}
