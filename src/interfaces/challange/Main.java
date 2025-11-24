package interfaces.challange;

import interfaces.challange.enums.UsageType;
import interfaces.challange.enums.UtilityType;
import interfaces.challange.interfaces.Mappable;
import interfaces.challange.service.Building;
import interfaces.challange.service.UtilityLine;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Mappable> mappables = new ArrayList<>();

        mappables.add(new Building("My House" , UsageType.HOUSE));
        mappables.add(new Building("My School" , UsageType.SCHOOL));
        mappables.add(new Building("My Office" , UsageType.CORPORATE_OFFICE));
        mappables.add(new Building("Target" , UsageType.SHOP));
        mappables.add(new UtilityLine("My Electicity Line" , UtilityType.ELECTIRCITY));
        mappables.add(new UtilityLine("My Wifi Line" , UtilityType.FIBER_OPTICS));
        mappables.add(new UtilityLine("My Water Line" , UtilityType.WATER));
        mappables.add(new UtilityLine("My Gas Line" , UtilityType.GAS));


        mapObjects(mappables);

    }

    public static void mapObjects(List<Mappable> mappables){
        for( var m : mappables){
            Mappable.mapIt(m);
        }
    }
}
