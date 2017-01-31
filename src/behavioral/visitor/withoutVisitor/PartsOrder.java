package behavioral.visitor.withoutVisitor;

import java.util.ArrayList;
import java.util.List;

public class PartsOrder {

    private List<AtvPart> parts;

    public PartsOrder() {
        parts = new ArrayList<>();
    }

    public void addPart(AtvPart atvPart) {
        parts.add(atvPart);
    }

    public List<AtvPart> getParts() {
        return parts;
    }

    // If we need method to calculateShipping, we need add this method in every class
//    public void calculateShipping() {
//        for (AtvPart part:  parts) {
//            part.calculateShipping();
//        }
//    }
    // What will we do if we need for example calculateShippingWithTaxes??

}
