// source: https://www.tutorialspoint.com/design_pattern/decorator_pattern.htm
package decorator1;

public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border:");
        circle.draw();
        System.out.println("\nCircle with red border:");
        redCircle.draw();
        System.out.println("\nRectangle with red border:");
        redRectangle.draw();

        Shape dashedRectangle = new DashedBorderDecorator(new Rectangle());
        Shape dashedRedCircle = new DashedBorderDecorator(new RedShapeDecorator(new Circle()));

        System.out.println("\nRectangle with dashed border:");
        dashedRectangle.draw();
        System.out.println("\nDashed red circle:");
        dashedRedCircle.draw();
    }
}
