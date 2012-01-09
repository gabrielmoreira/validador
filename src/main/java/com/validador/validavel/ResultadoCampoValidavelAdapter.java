package com.validador.validavel;

import com.validador.regra.Resultado;

public class ResultadoCampoValidavelAdapter implements Resultado {

	private Validavel<?, ?> validavel;
	private ResultadoCampo resultado;

	public ResultadoCampoValidavelAdapter(Validavel<?, ?> validavel, ResultadoCampo resultado) {
		this.validavel = validavel;
		this.resultado = resultado;
	}

	public void erro(String codigo) {
		resultado.erro(validavel.getNomeObjeto(), validavel.getNomeCampo(), codigo);
	}

	public void erro(String codigo, Object... parametros) {
		resultado.erro(validavel.getNomeObjeto(), validavel.getNomeCampo(), codigo, parametros);
	}

}
