// source: https://refactoring.guru/design-patterns/abstract-factory
package abstractFactory2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {

    public static void main(String[] args) {
        AbstractFactory factory = new FurnitureFactory();
        Furniture victorianSofa = (Furniture) factory.create("sofa", "victorian");

        System.out.println("Furniture "+victorianSofa.getFurniture());
        System.out.println("Legs "+victorianSofa.getNumberOfLegs());
        System.out.println("Possible to sit? "+victorianSofa.sitOn());
        System.out.println("Style "+victorianSofa.getStyle());
        System.out.println("");

        Furniture artDecoTable = (Furniture) factory.create("table", "artdeco");

        System.out.println("Furniture "+artDecoTable.getFurniture());
        System.out.println("Legs "+artDecoTable.getNumberOfLegs());
        System.out.println("Possible to sit? "+artDecoTable.sitOn());
        System.out.println("Style "+artDecoTable.getStyle());
        System.out.println("");

        Furniture modernChair = (Furniture) factory.create("chair", "modern");

        System.out.println("Furniture "+modernChair.getFurniture());
        System.out.println("Legs "+modernChair.getNumberOfLegs());
        System.out.println("Possible to sit? "+modernChair.sitOn());
        System.out.println("Style "+modernChair.getStyle());
        System.out.println("");
    }
}
