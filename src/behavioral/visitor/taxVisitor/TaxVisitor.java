package behavioral.visitor.taxVisitor;

// Concrete Visitor Class

import java.text.DecimalFormat;

public class TaxVisitor implements Visitor {

    private DecimalFormat df = new DecimalFormat("#.##");

    // Calculates total price based on this being taxed
    // as a liquor item

    @Override
    public float visit(Liquor liquor) {
        System.out.println("Liquor Item: Price with Tax");
        return Float.parseFloat(df.format((liquor.getPrice() * .18))) + liquor.getPrice();
    }

    // Calculates total price based on this being taxed
    // as a tobacco item

    public float visit(Tobacco tobaccoItem) {
        System.out.println("Tobacco Item: Price with Tax");
        return Float.parseFloat(df.format((tobaccoItem.getPrice() * .32) + tobaccoItem.getPrice()));
    }

    // Calculates total price based on this being taxed
    // as a necessity item

    public float visit(Necessity necessityItem) {
        System.out.println("Necessity Item: Price with Tax");
        return Float.parseFloat(df.format(necessityItem.getPrice()));

    }

}
