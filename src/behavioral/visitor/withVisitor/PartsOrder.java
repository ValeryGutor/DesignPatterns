package behavioral.visitor.withVisitor;

import java.util.ArrayList;
import java.util.List;

public class PartsOrder implements AtvPart {

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

    @Override
    public void accept(AtvPartVisitor visitor) {
        for (AtvPart part: parts) {
            part.accept(visitor);
        }
        visitor.visit(this);
    }
}
