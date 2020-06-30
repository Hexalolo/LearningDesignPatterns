// source: https://www.baeldung.com/java-decorator-pattern
package decorator2;

public class Main {

    public static void main(String[] args) {
        ChristmasTree myTree = new ChristmasTreeImpl();
        System.out.println("Each state of decoration step by step");
        System.out.println(myTree.decorate());

        myTree = new BubbleLights(myTree);
        System.out.println(myTree.decorate());

        myTree = new Garland(myTree);
        System.out.println(myTree.decorate());

        myTree = new Tinsel(new TreeTopper(myTree));
        System.out.println(myTree.decorate());
    }
}
