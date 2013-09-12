package malaka.cse.maven.exception;

public class InvalidNICException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidNICException() {
		super("Invalid NIC number.");
	}
}
