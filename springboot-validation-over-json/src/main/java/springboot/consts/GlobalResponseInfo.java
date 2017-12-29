package springboot.consts;

/**
 * Created by Administrator on 2017/12/29.
 */
public enum GlobalResponseInfo implements ResponseInfo{
    SUCCESS("0001", "success"),
    NOT_FOUND("9999", "not found");


    GlobalResponseInfo(String code, String message){
        this.code = code;
        this.message = message;
    }

    private String code;

    private String message;

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
