package springboot.dao;

import springboot.domain.City;

import java.util.List;

/**
 * Created by Administrator on 2017/12/29.
 */
public interface CityDao {

    City findById(String id);

    List<City> findAllCity();

    void saveCity(City city);

    void updateCity(City city);

    void deleteCity(String id);

}
