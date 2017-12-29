package springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springboot.domain.City;
import springboot.service.CityService;

import java.util.List;

/**
 * Created by Administrator on 2017/12/29.
 */
@RestController
public class CityRestController {
    @Autowired
    private CityService cityService;

    @RequestMapping(value="/api/city/{id}", method= RequestMethod.GET)
    public City findCity(@PathVariable("id") String id){
        return cityService.findById(id);
    }

    @RequestMapping(value="/api/city", method=RequestMethod.GET)
    public List<City> findAllCity(){
        return cityService.findAllCity();
    }

    @RequestMapping(value="/api/city", method=RequestMethod.POST)
    public void saveCity(@RequestBody City city){
        cityService.saveCity(city);
    }

    @RequestMapping(value="/api/city", method = RequestMethod.PUT)
    public void updateCity(@RequestBody City city){
        cityService.updateCity(city);
    }

    @RequestMapping(value="/api/city/{id}", method = RequestMethod.DELETE)
    public void deleteCity(@PathVariable("id") String id){
        cityService.deleteCity(id);
    }

}
