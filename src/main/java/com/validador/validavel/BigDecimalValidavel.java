package com.validador.validavel;

import java.math.BigDecimal;

public class BigDecimalValidavel<T extends BigDecimalValidavel<?>> extends NumericoValidavel<T, BigDecimal> {

	public BigDecimalValidavel(String nomeCampo, BigDecimal valorCampo) {
		super(nomeCampo, valorCampo);
	}

	public BigDecimalValidavel(String nomeObjeto, String nomeCampo, BigDecimal valorCampo) {
		super(nomeObjeto, nomeCampo, valorCampo);
	}

}
