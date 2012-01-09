package com.validador.regra;

public interface Resultado {
	public void erro(String codigo);

	public void erro(String codigo, Object... parametros);
}
