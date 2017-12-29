package springboot.domain.result;

import springboot.consts.CityResponseInfo;
import springboot.consts.GlobalResponseInfo;
import springboot.consts.ResponseInfo;

/**
 * Created by Administrator on 2017/12/29.
 */
public class ResultBody {

    private String code;

    private String message;

    private Object result;

    public ResultBody(ResponseInfo responseInfo){
        this.code = responseInfo.getCode();
        this.message = responseInfo.getMessage();
    }

    public ResultBody(Object result){
        this.code = GlobalResponseInfo.SUCCESS.getCode();
        this.message = GlobalResponseInfo.SUCCESS.getMessage();
        this.result = result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
