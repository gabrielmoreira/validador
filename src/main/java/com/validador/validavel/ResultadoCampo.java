package com.validador.validavel;

public interface ResultadoCampo {

	public void erro(String objeto, String campo, String codigo);

	public void erro(String objeto, String campo, String codigo, Object... parametros);
}
