package com.validador.validavel;

import com.validador.regra.AbstractRegra;

public interface Validavel<T extends Validavel<?, ?>, K> {

	public abstract String getNomeCampo();

	public abstract K getValorCampo();

	public abstract T opcional();

	public abstract T nao();

	public abstract T preenchido();

	public abstract T regra(AbstractRegra<?> regra);

	public abstract boolean valido();

	public abstract boolean valido(ResultadoCampo resultadoCampo);

	public abstract boolean isInversa();

	public abstract String getNomeObjeto();

}