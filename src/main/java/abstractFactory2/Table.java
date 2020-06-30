package abstractFactory2;

import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

public class Table implements Furniture{
    @Override
    public int getNumberOfLegs() {
        return 3;
    }

    @Override
    public boolean sitOn() {
        return false;
    }

    @Override
    public String getFurniture(){
        return "Table";
    }

    @Override
    public String getStyle() {
        return "";
    }
}
