package com.validador.validavel;

public class ResultadoCampoIgnorado implements ResultadoCampo {

	public static final ResultadoCampoIgnorado INSTANCE = new ResultadoCampoIgnorado();

	private ResultadoCampoIgnorado() {
	}

	public void erro(String objeto, String campo, String codigo) {
	}

	public void erro(String objeto, String campo, String codigo, Object... parametros) {
	}

}
