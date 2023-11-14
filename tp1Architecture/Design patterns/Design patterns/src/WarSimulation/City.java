package WarSimulation;

public class City {
    Integer citizens;
    Integer soldiers;

    public City(Integer soldiers,Integer citizens) {
        this.citizens = citizens;
        this.soldiers = soldiers;
    }

    public Integer getCitizens() {
        return citizens;
    }

    public void setCitizens(Integer citizens) {
        this.citizens = citizens;
    }

    public Integer getSoldiers() {
        return soldiers;
    }

    public void setSoldiers(Integer soldiers) {
        this.soldiers = soldiers;
    }

    public String report() {
        //retreiving number of soldiers in city and number of citiziens in the city

        return  soldiers + "-" + citizens;
    }
    public Integer retrieveHalfSoldiers(){
        int half=this.soldiers/2;
        this.soldiers -= half;
        return half;
    }


}
