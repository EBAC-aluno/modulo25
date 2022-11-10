package dev.lobophf.myApplication.exceptions;

public class KeyNotFoundException extends Exception {

    
	private static final long serialVersionUID = -1389494676398525746L;

	public KeyNotFoundException(String msg) {
        this(msg, null);
    }

    public KeyNotFoundException(String msg, Throwable e) {
        super(msg, e);
    }

}
