package com.validador;

import java.math.BigDecimal;

import com.validador.validavel.BigDecimalValidavel;
import com.validador.validavel.StringValidavel;

public class Campos {

	public static BigDecimalValidavel<?> numero(String nomeCampo, BigDecimal valorCampo) {
		return new BigDecimalValidavel<BigDecimalValidavel<?>>(nomeCampo, valorCampo);
	}

	public static BigDecimalValidavel<?> numero(String nomeObjeto, String nomeCampo, BigDecimal valorCampo) {
		return new BigDecimalValidavel<BigDecimalValidavel<?>>(nomeObjeto, nomeCampo, valorCampo);
	}

	public static StringValidavel<?> string(String nomeObjeto, String nomeCampo, String valorCampo) {
		return new StringValidavel<StringValidavel<?>>(nomeObjeto, nomeCampo, valorCampo);
	}

	public static StringValidavel<?> string(String nomeCampo, String valorCampo) {
		return new StringValidavel<StringValidavel<?>>(nomeCampo, valorCampo);
	}

}
