// source: https://www.baeldung.com/java-abstract-factory-pattern
package abstractFactory1;

import javax.xml.stream.FactoryConfigurationError;

public class Main {
    public static void main(String[] args) {
        AbstractFactory animalFactory = FactoryProvider.getFactory("Animal");
        AbstractFactory colorFactory = FactoryProvider.getFactory("Color");

        Animal dog = (Animal) animalFactory.create("dog");
        System.out.println(dog.getClass().getName());
        System.out.println(dog.getAnimal());
        System.out.println(dog.makeSound());

        Animal bear = (Animal) animalFactory.create("bear");
        System.out.println(bear.makeSound());
        System.out.println(bear.getAnimal());

        Color myColor = (Color) colorFactory.create("Bear");
        System.out.println(myColor.getColor());
        Color duckColor = (Color) colorFactory.create("duck");
        System.out.println(duckColor.getColor());

    }
}
