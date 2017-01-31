package behavioral.visitor.taxVisitor;

// Concrete Visitor Class

import java.text.DecimalFormat;

public class TaxVisitor implements Visitor {

    private DecimalFormat df = new DecimalFormat("#.##");

    // Calculates total price based on this being taxed
    // as a liquor item

    @Override
    public double visit(Liquor liquer) {
        System.out.println("Liquor Item: Price with Tax");
        return Double.parseDouble(df.format((liquorItem.getPrice() * .18) + liquorItem.getPrice()));
    }

    // Calculates total price based on this being taxed
    // as a tobacco item

    public double visit(Tobacco tobaccoItem) {
        System.out.println("Tobacco Item: Price with Tax");
        return Double.parseDouble(df.format((tobaccoItem.getPrice() * .32) + tobaccoItem.getPrice()));
    }

    // Calculates total price based on this being taxed
    // as a necessity item

    public double visit(Necessity necessityItem) {
        System.out.println("Necessity Item: Price with Tax");
        return Double.parseDouble(df.format(necessityItem.getPrice()));

    }

}
