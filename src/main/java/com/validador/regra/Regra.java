package com.validador.regra;

import com.validador.validavel.Validavel;

public interface Regra<K> {

	public abstract <T extends Validavel<?, ?>> boolean validar(T validavel, Resultado resultado);

	public abstract boolean validar(K valor);

	public abstract boolean validar(K valor, Resultado resultado);

}