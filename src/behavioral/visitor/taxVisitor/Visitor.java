package behavioral.visitor.taxVisitor;

// The visitor pattern is used when you have to perform
// the same action on many objects of different types

public interface Visitor {

     double visit(Liquor liquer);
     double visit(Tobacco tobacco);
     double visit(Necessity necessity);

}
