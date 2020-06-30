package decorator1;

public class DashedBorderDecorator extends ShapeDecorator {
    public DashedBorderDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw(){
        decoratedShape.draw();
        setDashedBorder(decoratedShape);
    }

    private void setDashedBorder(Shape decoratedShape){
        System.out.println("Border is dashed");
    }
}
