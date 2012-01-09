package com.validador.validavel;

import com.validador.regra.RegraExpressao;

public class ExpressaoValidavel<T extends ExpressaoValidavel<?>> extends AbstractValidavel<T, Boolean> {
	public ExpressaoValidavel(Boolean expressao) {
		super(null, expressao);
	}

	public ExpressaoValidavel(String nomeCampo, Boolean expressao) {
		super(nomeCampo, expressao);
	}

	public ExpressaoValidavel(String nomeObjeto, String nomeCampo, Boolean expressao) {
		super(nomeObjeto, nomeCampo, expressao);
	}

	public T verdadeira() {
		regra(RegraExpressao.verdadeira());
		return me();
	}

	public T falsa() {
		regra(RegraExpressao.falsa());
		return me();
	}

	public T verdadeira(String regra) {
		regra(RegraExpressao.verdadeira(regra));
		return me();
	}

	public T falsa(String regra) {
		regra(RegraExpressao.falsa(regra));
		return me();
	}

	public T verdadeira(String regra, Object... parametros) {
		regra(RegraExpressao.verdadeira(regra, parametros));
		return me();
	}

	public T falsa(String regra, Object... parametros) {
		regra(RegraExpressao.falsa(regra, parametros));
		return me();
	}

}
