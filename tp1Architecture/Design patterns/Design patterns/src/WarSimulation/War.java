package WarSimulation;

import WarSimulation.Factory.MapFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class War {
    List<Kingdom> kingdomList;
    List<CountryDistance> map;

    private War(WarBuilder warBuilder){
        this.kingdomList=warBuilder.kingdomList;
        this.map=warBuilder.map;
    }

    public void prepareAttack(){
        Map<String,Integer> firstKingdomMap = new HashMap<>();
        Map<String,Integer> secondKingdomMap = new HashMap<>();

        int index=0;
        for(Country country:this.kingdomList.get(0).countryList){
            firstKingdomMap.put(country.getName(),index++);
        }
        index=0;
        for(Country country:this.kingdomList.get(1).countryList){
            secondKingdomMap.put(country.getName(),index++);
        }

        Kingdom powerfullKingdom = this.kingdomList.get(0).currentPower() > this.kingdomList.get(1).currentPower() ? this.kingdomList.get(0) : this.kingdomList.get(1);

        Integer nearestCountryIndex=null;
        int minDistance=Integer.MAX_VALUE;

        for(CountryDistance countryDistance:this.map){
            if((firstKingdomMap.containsKey(countryDistance.firstCountry)
                    && secondKingdomMap.containsKey(countryDistance.secondCountry))
                        && countryDistance.distance < minDistance
            ){
                nearestCountryIndex = firstKingdomMap.get(countryDistance.firstCountry);
                minDistance = countryDistance.distance;
            }else if((secondKingdomMap.containsKey(countryDistance.firstCountry)
                    && firstKingdomMap.containsKey(countryDistance.secondCountry))
                        && countryDistance.distance < minDistance
            ){
                nearestCountryIndex = firstKingdomMap.get(countryDistance.secondCountry);
                minDistance = countryDistance.distance;
            }

        }
        index=0;
        for(Country country:powerfullKingdom.countryList){
            if(index!=nearestCountryIndex){
                for (City city:country.getCities()){
                    powerfullKingdom.countryList.get(nearestCountryIndex).addSoldiersOnEdges(city.retrieveHalfSoldiers());
                }
            }
            index++;
        }

    }

    public static class WarBuilder {
        List<Kingdom> kingdomList=new ArrayList<>(2);
        List<CountryDistance> map;

        public WarBuilder addKingdom(Kingdom kingdom) {
            this.kingdomList.add(kingdom);
            return this;
        }

        public WarBuilder addMap(String mapString) {
            this.map= MapFactory.createMap(mapString);
            return this;
        }

        public War build(){
            return new War(this);
        }
    }
}
