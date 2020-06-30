//source: https://javadeveloper.pl/wzorzec-strategia/
package strategy1;

public class Main {
    public static void main(String[] args) {
        FormatterContext context = new FormatterContext();
        String testingText = "tHis is MY testing TEXT";

        context.set(new CapitalizeFormatter());
        context.print(testingText);

        context.set(new UpperCaseFormatter());
        context.print(testingText);

        context.set(new LowerCaseFormatter());
        context.print(testingText);
    }
}
