package springboot.consts;

/**
 * Created by Administrator on 2017/12/29.
 */
public enum CityResponseInfo implements ResponseInfo {
    PARAM_NO_COMPLETE("9001", "params no complete"),
    CITY_EXISTS("0001", "city exists");

    private String code;

    private String message;

    CityResponseInfo(String code, String message){
        this.code = code;
        this.message = message;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
