package exceptionHandling;

public class BigBazarException extends Exception{
	String msg;
	
	public BigBazarException(String msg) {
		this.msg=msg;
	}
	
	public String getmsg() {
		return msg;
	}

}
