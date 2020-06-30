package decorator2;

public class Tinsel extends TreeDecorator {

    public Tinsel(ChristmasTree tree) {
        super(tree);
    }

    @Override
    public String decorate(){
        return super.decorate() + decorateWithTinsel();
    }

    private String decorateWithTinsel(){
        return " with tinsel";
    }
}
