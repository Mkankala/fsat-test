package ca.cgi.fsa.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cityId;

    String cityName;

    City() {

    }

    public City(String inCityName) {
        this.cityName = inCityName;
    }

    City() {

    }

    public City(String inCityName) {
        this.cityName = inCityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof City))
            return false;
        City city = (City) o;
        return Objects.equals(this.cityId, city.cityId) && Objects.equals(this.cityName, city.cityName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.cityId, this.cityName);
    }

    @Override
    public String toString() {
        return "City{" + "cityId=" + this.cityId + ", CityName='" + this.cityName + '\'' + '}';
    }

}