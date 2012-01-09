package com.validador.validavel;

import com.validador.regra.RegraExpressao;

public class ExpressaoValidavel<T extends ExpressaoValidavel<?>> extends AbstractValidavel<T, Boolean> {
	public ExpressaoValidavel(Boolean expressao) {
		super(null, expressao);
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

}
