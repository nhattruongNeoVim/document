package fa.training.exception;

public class IncorrectFormatException extends Exception {
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for IncorrectFomartException without Parameters.
	 */
	public IncorrectFormatException() {
		super();
	}

	/**
	 * Constructor for IncorrectFomartException with message.
	 */
	public IncorrectFormatException(String message) {
		super(message);
	}

}
