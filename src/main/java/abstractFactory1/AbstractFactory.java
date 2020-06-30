package abstractFactory1;

public interface AbstractFactory<T> {
    T create(String animalType);
}
