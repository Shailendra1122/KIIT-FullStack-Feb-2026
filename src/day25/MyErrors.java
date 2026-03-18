package day25;

public enum MyErrors
{
	ERR1("ERR-01","%s is a Invalid Username"), // MyErrors ERR1=new  MyErrors("ERR-01","%s is a Invalid Username")
	ERR2("ERR-02","Invalid Password");
	
	private String errorCode;
	private String errorMessage;
	
	private MyErrors(String errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
	
	
	
}
