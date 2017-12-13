package customexception;

import java.io.Serializable;

public class CustomerNotFoundException extends RuntimeException implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomerNotFoundException(String message) {
		super(message);

	}

	public CustomerNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

}
