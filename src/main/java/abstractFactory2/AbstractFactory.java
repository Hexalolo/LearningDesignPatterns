package abstractFactory2;

public interface AbstractFactory<T> {
    T create(String furniture, String style);
}
