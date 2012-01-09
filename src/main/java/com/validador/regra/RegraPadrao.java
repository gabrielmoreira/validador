package com.validador.regra;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegraPadrao extends AbstractRegra<String> {

	private static final String REGRA = "estaNoPadrao";
	private static final String REGRA_CONTEM = "contemPadrao";

	private String regra;
	private Pattern padrao;
	private boolean contem;

	public RegraPadrao(Pattern padrao) {
		this.padrao = padrao;
		this.regra = REGRA;
	}

	public RegraPadrao(Pattern padrao, boolean contem) {
		this.padrao = padrao;
		this.contem = contem;
		this.regra = contem ? REGRA_CONTEM : REGRA;
	}

	public static RegraPadrao padrao(String padrao) {
		return padrao(Pattern.compile(padrao));
	}

	public static RegraPadrao padrao(String padrao, int flags) {
		return padrao(Pattern.compile(padrao, flags));
	}

	public static RegraPadrao padrao(Pattern padrao) {
		return new RegraPadrao(padrao);
	}

	public static RegraPadrao contemPadrao(String padrao) {
		return contemPadrao(Pattern.compile(padrao));
	}

	public static RegraPadrao contemPadrao(String padrao, int flags) {
		return contemPadrao(Pattern.compile(padrao, flags));
	}

	public static RegraPadrao contemPadrao(Pattern padrao) {
		return new RegraPadrao(padrao, true);
	}

	@Override
	public boolean validar(String valor, Resultado resultado) {
		Matcher matcher = padrao.matcher(valor);
		boolean valido = contem ? matcher.find() : matcher.matches();
		if (!valido) {
			resultado.erro(regra, valor, padrao.pattern());
		}
		//TODO Implementar forma de capturar os grupos. Exemplo: if (resultado instanceof ResultadoComCaptura) resultadoComCaptura.set(matcher);
		return valido;
	}

}
