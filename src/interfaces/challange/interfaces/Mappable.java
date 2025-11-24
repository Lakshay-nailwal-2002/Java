package interfaces.challange.interfaces;

import interfaces.challange.enums.Geometry;

public interface Mappable {

    String JSON_PROPERTY = """
            "properties": {%s} """;

    String getLabel();

    Geometry getShape();

    String getMarker();

    default String toJson() {
        return """
                "type": "%s", "label": "%s", "marker": "%s" """.formatted(getShape(), getLabel(), getMarker());
    }

    static void mapIt(Mappable mappable){
        System.out.printf((JSON_PROPERTY) + "%n", mappable.toJson());
    }
}
