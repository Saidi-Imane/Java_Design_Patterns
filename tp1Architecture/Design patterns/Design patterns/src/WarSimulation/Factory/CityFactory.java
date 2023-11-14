package WarSimulation.Factory;

import WarSimulation.City;

public class CityFactory {
    private City city;

    public CityFactory() {
    }

    public City createCity(int nbrOfSoldier, int nbrOfCtizen){
        this.city=new City(nbrOfSoldier,nbrOfCtizen);
        return this.city;
    }
}
