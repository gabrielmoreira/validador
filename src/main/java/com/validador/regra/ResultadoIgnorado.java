package com.validador.regra;

public class ResultadoIgnorado implements Resultado {

	public static final ResultadoIgnorado INSTANCE = new ResultadoIgnorado();

	private ResultadoIgnorado() {
	}

	public void erro(String codigo) {
	}

	public void erro(String codigo, Object... parametros) {
	}

}
