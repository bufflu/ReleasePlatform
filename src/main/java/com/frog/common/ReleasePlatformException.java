package com.frog.common;

/**
 * ClassName: className
 * Description: desc
 * Date: 2019/6/26 16:45
 *
 * @author guoxinlu
 */
public class ReleasePlatformException extends RuntimeException {

    public ReleasePlatformException() {
    }

    public ReleasePlatformException(String message) {
        super(message);
    }

    public ReleasePlatformException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReleasePlatformException(Throwable cause) {
        super(cause);
    }
}
