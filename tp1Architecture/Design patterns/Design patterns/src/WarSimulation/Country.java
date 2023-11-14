package WarSimulation;

import java.util.ArrayList;
import java.util.List;

public class Country {
    String name;
    List<City> cities=new ArrayList<>();
    Integer soldiersOnEdges;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<City> getCities() {
        return cities;
    }

    public void addCity(City city) {
        this.cities.add(city);
    }
    public Integer getSoldiersOnEdges() {
        return soldiersOnEdges;
    }
    public void setSoldiersOnEdges(Integer soldiersOnEdges) {
        this.soldiersOnEdges = soldiersOnEdges;
    }
    public void addSoldiersOnEdges(Integer soldiersOnEdges) {
        this.soldiersOnEdges += soldiersOnEdges;
    }
    public String report() {
        StringBuilder report = new StringBuilder();
        report.append(name.charAt(0) + ":<");

        for (int i = 0; i < cities.size(); i++) {
            City city = cities.get(i);
            if (i != 0) {
                report.append(",");
            }
            report.append(name.charAt(0) + "c" + (i + 1) + ":" + city.report());
        }

        report.append(">");
        if(getSoldiersOnEdges()!=null)
            report.append("-" + getSoldiersOnEdges());
        return report.toString();
    }
}
