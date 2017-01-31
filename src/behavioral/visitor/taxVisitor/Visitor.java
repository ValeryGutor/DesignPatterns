package behavioral.visitor.taxVisitor;

// The visitor pattern is used when you have to perform
// the same action on many objects of different types

public interface Visitor {

     float visit(Liquor liquer);
     float visit(Tobacco tobacco);
     float visit(Necessity necessity);

}
