package exceptions;

public class NotEnoughMoneyException extends RuntimeException {

	private static final long serialVersionUID = 1783017797965554864L;
	private String message;
	
	public NotEnoughMoneyException(String msg) {
		this.message = msg;
	}
	public String getMessage() {
		return this.message;
	}
}
