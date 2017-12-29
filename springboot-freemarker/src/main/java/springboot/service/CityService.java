package springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.dao.CityDao;
import springboot.domain.City;

import java.util.List;

/**
 * Created by Administrator on 2017/12/29.
 */
@Service
public class CityService {
    @Autowired
    private CityDao cityDao;

    public City findById(String id){
        return cityDao.findById(id);
    }

    public List<City> findAllCity(){
        return cityDao.findAllCity();
    }

    public void deleteCity(String id){
        cityDao.deleteCity(id);
    }

    public void updateCity(City city){
        cityDao.updateCity(city);
    }

    public void saveCity(City city){
        cityDao.saveCity(city);
    }
}
