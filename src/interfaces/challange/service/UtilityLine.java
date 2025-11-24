package interfaces.challange.service;

import interfaces.challange.enums.*;
import interfaces.challange.interfaces.Mappable;

public class UtilityLine implements Mappable {

    private String name;
    private UtilityType type;

    public UtilityLine(String name , UtilityType type){
        this.name = name;
        this.type = type;
    }

    @Override
    public String getLabel() {
        return name + " ( " + type + " )";
    }

    @Override
    public Geometry getShape() {
        return Geometry.LINE;
    }

    @Override
    public String getMarker() {
        return switch (type) {
            case WATER -> Color.GREEN + " " + LineMarker.DOTTED;
            case GAS -> Color.BLUE + " " + LineMarker.DASHED;
            case ELECTIRCITY -> Color.RED + " " + LineMarker.SOLID;
            default -> Color.RED + " " + LineMarker.DOTTED;
        };
    }

    @Override
    public String toJson() {
        return Mappable.super.toJson() + """
                , "name": "%s", "type": "%s" """.formatted(name,type);
    }
}
