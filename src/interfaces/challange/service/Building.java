package interfaces.challange.service;

import interfaces.challange.enums.Color;
import interfaces.challange.enums.Geometry;
import interfaces.challange.enums.PointMarker;
import interfaces.challange.enums.UsageType;
import interfaces.challange.interfaces.Mappable;

public class Building implements Mappable {

    private final String name;

    private final UsageType usageType;

    public Building(String name, UsageType usageType){
        this.name = name;
        this.usageType = usageType;
    }


    @Override
    public String getLabel() {
        return name + " ( " + usageType + " )";
    }

    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }

    @Override
    public String getMarker() {
        return switch (usageType) {
            case SCHOOL -> Color.GREEN + " " + PointMarker.TRIANGLE;
            case SHOP -> Color.BLUE + " " + PointMarker.STAR;
            case HOUSE -> Color.RED + " " + PointMarker.CIRCLE;
            default -> Color.RED + " " + PointMarker.TRIANGLE;
        };
    }

    @Override
    public String toJson() {
        return Mappable.super.toJson() + """
               , "name" : "%s" , "usage": "%s" """.formatted(name , usageType);
    }
}
