package decorator2;

public class BubbleLights extends TreeDecorator {

    public BubbleLights(ChristmasTree tree) {
        super(tree);
    }

    @Override
    public String decorate(){
        return super.decorate() + decorateWithBubbleLights();
    }

    private String decorateWithBubbleLights(){
        return " with bubble lights";
    }
}
