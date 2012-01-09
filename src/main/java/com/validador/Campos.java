package com.validador;

import java.math.BigDecimal;

import com.validador.validavel.BigDecimalValidavel;
import com.validador.validavel.ByteValidavel;
import com.validador.validavel.DoubleValidavel;
import com.validador.validavel.IntegerValidavel;
import com.validador.validavel.LongValidavel;
import com.validador.validavel.ShortValidavel;
import com.validador.validavel.StringValidavel;

public class Campos {

	public static BigDecimalValidavel<?> numero(String nomeCampo, BigDecimal valorCampo) {
		return new BigDecimalValidavel<BigDecimalValidavel<?>>(nomeCampo, valorCampo);
	}

	public static BigDecimalValidavel<?> numero(String nomeObjeto, String nomeCampo, BigDecimal valorCampo) {
		return new BigDecimalValidavel<BigDecimalValidavel<?>>(nomeObjeto, nomeCampo, valorCampo);
	}

	public static ByteValidavel<?> numero(String nomeCampo, Byte valorCampo) {
		return new ByteValidavel<ByteValidavel<?>>(nomeCampo, valorCampo);
	}

	public static ByteValidavel<?> numero(String nomeObjeto, String nomeCampo, Byte valorCampo) {
		return new ByteValidavel<ByteValidavel<?>>(nomeObjeto, nomeCampo, valorCampo);
	}

	public static DoubleValidavel<?> numero(String nomeCampo, Double valorCampo) {
		return new DoubleValidavel<DoubleValidavel<?>>(nomeCampo, valorCampo);
	}

	public static DoubleValidavel<?> numero(String nomeObjeto, String nomeCampo, Double valorCampo) {
		return new DoubleValidavel<DoubleValidavel<?>>(nomeObjeto, nomeCampo, valorCampo);
	}

	public static IntegerValidavel<?> numero(String nomeCampo, Integer valorCampo) {
		return new IntegerValidavel<IntegerValidavel<?>>(nomeCampo, valorCampo);
	}

	public static IntegerValidavel<?> numero(String nomeObjeto, String nomeCampo, Integer valorCampo) {
		return new IntegerValidavel<IntegerValidavel<?>>(nomeObjeto, nomeCampo, valorCampo);
	}

	public static LongValidavel<?> numero(String nomeCampo, Long valorCampo) {
		return new LongValidavel<LongValidavel<?>>(nomeCampo, valorCampo);
	}

	public static LongValidavel<?> numero(String nomeObjeto, String nomeCampo, Long valorCampo) {
		return new LongValidavel<LongValidavel<?>>(nomeObjeto, nomeCampo, valorCampo);
	}

	public static ShortValidavel<?> numero(String nomeCampo, Short valorCampo) {
		return new ShortValidavel<ShortValidavel<?>>(nomeCampo, valorCampo);
	}

	public static ShortValidavel<?> numero(String nomeObjeto, String nomeCampo, Short valorCampo) {
		return new ShortValidavel<ShortValidavel<?>>(nomeObjeto, nomeCampo, valorCampo);
	}

	public static StringValidavel<?> texto(String nomeObjeto, String nomeCampo, String valorCampo) {
		return new StringValidavel<StringValidavel<?>>(nomeObjeto, nomeCampo, valorCampo);
	}

	public static StringValidavel<?> texto(String nomeCampo, String valorCampo) {
		return new StringValidavel<StringValidavel<?>>(nomeCampo, valorCampo);
	}

}
