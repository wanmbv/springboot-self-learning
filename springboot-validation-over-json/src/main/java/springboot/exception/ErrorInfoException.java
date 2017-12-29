package springboot.exception;

import springboot.consts.ResponseInfo;

/**
 * Created by Administrator on 2017/12/29.
 */
public class ErrorInfoException extends  Exception{

    private ResponseInfo responseInfo;

    public ErrorInfoException(ResponseInfo responseInfo){
        this.responseInfo = responseInfo;
    }

    public ResponseInfo getResponseInfo() {
        return responseInfo;
    }

    public void setResponseInfo(ResponseInfo responseInfo) {
        this.responseInfo = responseInfo;
    }
}
