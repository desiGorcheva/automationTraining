package bg.pragmatic.exceptions;

public class PageNumberException extends Exception {

	public PageNumberException() {
		super();
	}

	public PageNumberException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PageNumberException(String message, Throwable cause) {
		super(message, cause);
	}

	public PageNumberException(String message) {
		super(message);
	}

	public PageNumberException(Throwable cause) {
		super(cause);
	}

	
}
