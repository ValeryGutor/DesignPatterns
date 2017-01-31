package behavioral.visitor.taxVisitor;

import java.text.DecimalFormat;

// Concrete Visitor Class

class TaxHolidayVisitor implements Visitor {

    // This formats the item prices to 2 decimal places

    DecimalFormat df = new DecimalFormat("#.##");

    // This is created so that each item is sent to the
    // right version of visit() which is required by the
    // Visitor interface and defined below

    public TaxHolidayVisitor() {
    }

    // Calculates total price based on this being taxed
    // as a liquor item

    public float visit(Liquor liquorItem) {
        System.out.println("Liquor Item: Price with Tax");
        return Float.parseFloat(df.format((liquorItem.getPrice() * .10) + liquorItem.getPrice()));
    }

    // Calculates total price based on this being taxed
    // as a tobacco item

    public float visit(Tobacco tobaccoItem) {
        System.out.println("Tobacco Item: Price with Tax");
        return Float.parseFloat(df.format((tobaccoItem.getPrice() * .30) + tobaccoItem.getPrice()));
    }

    // Calculates total price based on this being taxed
    // as a necessity item

    public float visit(Necessity necessityItem) {
        System.out.println("Necessity Item: Price with Tax");
        return Float.parseFloat(df.format(necessityItem.getPrice()));
    }

}
