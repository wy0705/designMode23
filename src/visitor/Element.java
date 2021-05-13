package visitor;

public interface Element {
    abstract public void Accept(Visitor visitor);

}
