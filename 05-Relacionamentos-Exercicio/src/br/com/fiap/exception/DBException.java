package br.com.fiap.exception;

public class DBException extends Exception {

	public DBException() {
		super();
	}

	public DBException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public DBException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public DBException(String arg0) {
		super(arg0);
	}

	public DBException(Throwable arg0) {
		super(arg0);
	}

}
