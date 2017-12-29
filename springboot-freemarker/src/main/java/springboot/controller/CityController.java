package springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import springboot.domain.City;
import springboot.service.CityService;

import java.util.List;

/**
 * Created by Administrator on 2017/12/29.
 */
@Controller
public class CityController {
    @Autowired
    private CityService cityService;

    @RequestMapping(value="/api/city/{id}", method= RequestMethod.GET)
    public String findCity(@PathVariable("id") String id, Model model){
        model.addAttribute("city",cityService.findById(id));
        return "city";
    }

    @RequestMapping(value="/api/city", method=RequestMethod.GET)
    public String findAllCity(Model model){
        model.addAttribute("cityList",cityService.findAllCity());
        return "cityList";
    }

}
