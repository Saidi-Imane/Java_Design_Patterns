package WarSimulation;

public class CountryDistance {
    String firstCountry;
    String secondCountry;
    int distance;

    public CountryDistance(String firstCountry, String secondCountry, int distance) {
        this.firstCountry = firstCountry;
        this.secondCountry = secondCountry;
        this.distance = distance;
    }

    public String getFirstCountry() {
        return firstCountry;
    }

    public void setFirstCountry(String firstCountry) {
        this.firstCountry = firstCountry;
    }

    public String getSecondCountry() {
        return secondCountry;
    }

    public void setSecondCountry(String secondCountry) {
        this.secondCountry = secondCountry;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
