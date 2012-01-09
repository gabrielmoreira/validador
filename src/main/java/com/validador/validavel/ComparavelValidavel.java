package com.validador.validavel;

import com.validador.regra.RegraComparacao;

public abstract class ComparavelValidavel<T extends ComparavelValidavel<?, ?>, K> extends AbstractValidavel<T, K> {
	public ComparavelValidavel(String nomeCampo, K valorCampo) {
		super(nomeCampo, valorCampo);
	}

	public ComparavelValidavel(String nomeObjeto, String nomeCampo, K valorCampo) {
		super(nomeObjeto, nomeCampo, valorCampo);
	}

	public T maiorQue(K valorEsperado) {
		preenchido();
		regra(RegraComparacao.maiorQue((Comparable<?>) valorEsperado));
		return me();
	}

	public T maiorOuIgualQue(K valorEsperado) {
		preenchido();
		regra(RegraComparacao.maiorOuIgualQue((Comparable<?>) valorEsperado));
		return me();
	}

	public T igualQue(K valorEsperado) {
		preenchido();
		regra(RegraComparacao.igualQue((Comparable<?>) valorEsperado));
		return me();
	}

	public T menorQue(K valorEsperado) {
		preenchido();
		regra(RegraComparacao.menorQue((Comparable<?>) valorEsperado));
		return me();
	}

	public T menorOuIgualQue(K valorEsperado) {
		preenchido();
		regra(RegraComparacao.menorOuIgualQue((Comparable<?>) valorEsperado));
		return me();
	}

}
