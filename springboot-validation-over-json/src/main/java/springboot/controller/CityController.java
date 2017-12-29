package springboot.controller;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springboot.consts.CityResponseInfo;
import springboot.domain.City;
import springboot.domain.result.ResultBody;
import springboot.exception.ErrorInfoException;

/**
 * Created by Administrator on 2017/12/29.
 */
@RestController
public class CityController {

    @RequestMapping(value="/api/city", method= RequestMethod.GET)
    public ResultBody findCity(@RequestParam("name") String name) throws ErrorInfoException{
        if(StringUtils.isEmpty(name)){
            throw new ErrorInfoException(CityResponseInfo.PARAM_NO_COMPLETE);
        }
        return new ResultBody(new City("1","大连", "辽宁"));
    }
}
