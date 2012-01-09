package com.validador.regra;

import com.validador.validavel.Validavel;

public abstract class AbstractRegra<K> implements Regra<K> {

	public <T extends Validavel<?, ?>> boolean validar(T validavel, Resultado resultado) {
		@SuppressWarnings("unchecked")
		K valor = (K) validavel.getValorCampo();
		return validar(valor, resultado);
	}

	public boolean validar(K valor) {
		return validar(valor, ResultadoIgnorado.INSTANCE);
	}

	public abstract boolean validar(K valor, Resultado resultado);

}
