package WarSimulation.Factory;

import WarSimulation.City;
import WarSimulation.Country;

public class CountryFactory {

    public static Country createCountry(String ...countryString){
        Country country=new Country();
        country.setName(countryString[0]);
        for(int i =1;i<countryString.length;i+=2){
            int nbrOfSoldier=Integer.parseInt(countryString[i]);
            int nbrOfCitiziens=Integer.parseInt(countryString[i+1]);
            CityFactory city=new CityFactory();
            country.getCities().add(city.createCity(nbrOfSoldier,nbrOfCitiziens));

        }
        return country;
    }
}
