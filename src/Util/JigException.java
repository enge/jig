package Util;

public class JigException extends Exception {

	public JigException(String mensagem, Exception e) {
		super(mensagem, e);
	}

	public JigException(String mensagem) {
		super(mensagem);
	}
}
