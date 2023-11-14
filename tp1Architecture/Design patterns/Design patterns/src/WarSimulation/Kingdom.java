package WarSimulation;

import WarSimulation.Factory.CountryFactory;

import java.util.ArrayList;
import java.util.List;

public class Kingdom {

    String king;
    List<Country> countryList;

    private Kingdom(KingdomBuilder kingdomBuilder){
        this.king=kingdomBuilder.king;
        this.countryList=kingdomBuilder.countryList;
    }
    //calculating the power of each kingdom
    /* every kingdom has a power that is the sum of soldiers power on all his kingdoms */
    public int currentPower(){
        int power=0;
        for(Country country:this.countryList){
            for(City city:country.getCities()){
                power += city.getSoldiers();
            }
        }
        return power;
    }

    public String report() {
        StringBuilder report = new StringBuilder();
        report.append(king + ":|");

        for (int i = 0; i < countryList.size(); i++) {
            Country country = countryList.get(i);//retrieving each country of kingdom
            if (i != 0) {
                report.append(",");
            }
            report.append(country.report());//respecting the GASP PRINCIPLE
        }

        report.append("|");
        return report.toString();
    }

    static public class KingdomBuilder {
        String king;
        List<Country> countryList = new ArrayList<>();
        Integer soldiersOnEdges;
        public KingdomBuilder addKing(String king) {
            this.king = king;
            return this;
        }
        public KingdomBuilder addCountry(String ...countryString) {
            this.countryList.add(CountryFactory.createCountry(countryString));
            return this;
        }
        public KingdomBuilder addSoldiersOnEdges(String soldiersOnEdges) {
            for(Country country:this.countryList){
                country.setSoldiersOnEdges(Integer.parseInt(soldiersOnEdges));
            }
            return this;
        }
        public Kingdom build(){
            return new Kingdom(this);
        }
    }
}
