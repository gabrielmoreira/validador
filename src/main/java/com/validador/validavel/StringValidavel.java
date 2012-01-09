package com.validador.validavel;

import java.util.regex.Pattern;

import com.validador.regra.RegraPadrao;

public class StringValidavel<T extends StringValidavel<?>> extends ComparavelValidavel<T, String> {

	public StringValidavel(String nomeObjeto, String nomeCampo, String valorCampo) {
		super(nomeObjeto, nomeCampo, valorCampo);
	}

	public StringValidavel(String nomeCampo, String valorCampo) {
		super(nomeCampo, valorCampo);
	}

	public Validavel<?, ?> padrao(String padrao) {
		regra(RegraPadrao.padrao(Pattern.compile(padrao)));
		return me();
	}

	public Validavel<?, ?> padrao(String padrao, int flags) {
		regra(RegraPadrao.padrao(Pattern.compile(padrao, flags)));
		return me();
	}

	public Validavel<?, ?> padrao(Pattern padrao) {
		regra(RegraPadrao.padrao(padrao));
		return me();
	}
}
