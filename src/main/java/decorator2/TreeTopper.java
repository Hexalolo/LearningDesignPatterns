package decorator2;

public class TreeTopper extends TreeDecorator {
    public TreeTopper(ChristmasTree tree) {
        super(tree);
    }

    public String decorate(){
        return super.decorate() + decorateWithTreeTopper();
    }

    private String decorateWithTreeTopper(){
        return " with tree topper";
    }
}
