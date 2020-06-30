package abstractFactory2;

public class FurnitureFactory implements AbstractFactory{

    @Override
    public Furniture create(String furniture, String style) {
        if("chair".equalsIgnoreCase(furniture)){
            if ("modern".equalsIgnoreCase(style))
                return new Modern(new Chair());
            if ("artdeco".equalsIgnoreCase(style))
                return new ArtDeco(new Chair());
            if ("victorian".equalsIgnoreCase(style))
                return new Victorian(new Chair());
        }
        if("sofa".equalsIgnoreCase(furniture)){
            if ("modern".equalsIgnoreCase(style))
                return new Modern(new Sofa());
            if ("artdeco".equalsIgnoreCase(style))
                return new ArtDeco(new Sofa());
            if ("victorian".equalsIgnoreCase(style))
                return new Victorian(new Sofa());
        }
        if("table".equalsIgnoreCase(furniture)){
            if ("modern".equalsIgnoreCase(style))
                return new Modern(new Table());
            if ("artdeco".equalsIgnoreCase(style))
                return new ArtDeco(new Table());
            if ("victorian".equalsIgnoreCase(style))
                return new Victorian(new Table());
        }
        return null;
    }
}
