package com.validador.regra;

public class RegraComparacao extends AbstractRegra<Comparable<?>> {

	private Comparable<?> valorEsperado;
	private int comparacaoMinima;
	private int comparacaoMaxima;
	private String regra;

	public RegraComparacao(Comparable<?> valorEsperado, int comparacaoMinima, int comparacaoMaxima, String regra) {
		this.valorEsperado = valorEsperado;
		this.comparacaoMinima = comparacaoMinima;
		this.comparacaoMaxima = comparacaoMaxima;
		this.regra = regra;
	}

	public static RegraComparacao maiorQue(Comparable<?> valorEsperado) {
		return new RegraComparacao(valorEsperado, 1, 1, "maiorQue");
	}

	public static RegraComparacao maiorOuIgualQue(Comparable<?> valorEsperado) {
		return new RegraComparacao(valorEsperado, 0, 1, "maiorOuIgualQue");
	}

	public static RegraComparacao igualQue(Comparable<?> valorEsperado) {
		return new RegraComparacao(valorEsperado, 0, 0, "igualQue");
	}

	public static RegraComparacao menorQue(Comparable<?> valorEsperado) {
		return new RegraComparacao(valorEsperado, -1, -1, "menorQue");
	}

	public static RegraComparacao menorOuIgualQue(Comparable<?> valorEsperado) {
		return new RegraComparacao(valorEsperado, -1, 0, "menorOuIgualQue");
	}

	@Override
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public boolean validar(Comparable valorCampo, Resultado resultado) {
		int comparacao = Integer.signum(valorCampo.compareTo(this.valorEsperado));
		boolean valido = ((this.comparacaoMinima <= comparacao) && (comparacao <= this.comparacaoMaxima));
		if (!valido) {
			resultado.erro(regra, valorCampo, valorEsperado);
		}
		return valido;
	}
}
