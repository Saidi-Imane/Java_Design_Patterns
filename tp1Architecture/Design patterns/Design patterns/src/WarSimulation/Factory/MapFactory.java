package WarSimulation.Factory;

import WarSimulation.CountryDistance;

import java.util.ArrayList;
import java.util.List;

public class MapFactory {

    public static List<CountryDistance> createMap(String mapString){
        String[] mapArray = mapString.split(",");
        List<CountryDistance> map=new ArrayList<>();
        for(int i =0;i<mapArray.length;i++){
            String[] countryDistanceString=mapArray[i].split(":");
            map.add(new CountryDistance(countryDistanceString[0], countryDistanceString[2], Integer.parseInt(countryDistanceString[1])));
        }
        return map;
    }
}
