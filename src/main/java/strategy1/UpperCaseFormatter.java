package strategy1;

public class UpperCaseFormatter implements TextFormatterStrategy {
    @Override
    public String format(String text) {
        return text.toUpperCase();
    }
}
