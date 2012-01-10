package com.validador;

import static com.validador.Campos.data;
import static com.validador.Campos.numero;
import static com.validador.Campos.texto;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Test;

import com.validador.validavel.BigDecimalValidavel;
import com.validador.validavel.ByteValidavel;
import com.validador.validavel.DateValidavel;
import com.validador.validavel.DoubleValidavel;
import com.validador.validavel.IntegerValidavel;
import com.validador.validavel.LongValidavel;
import com.validador.validavel.ShortValidavel;
import com.validador.validavel.StringValidavel;

public class CamposTest {

	private final String nomeCampo = "NomeDoCampo";
	private final String nomeObjeto = "NomeDoObjeto";

	@Test
	public void instanceTest() {
		Campos camposInstance = new Campos();
		assertNotNull(camposInstance);
	}

	@Test
	public void numeroBigDecimalTest() {
		BigDecimal valorCampo = new BigDecimal(10);
		BigDecimalValidavel<?> validavel = numero(nomeCampo, valorCampo);
		assertEquals(nomeCampo, validavel.getNomeCampo());
		assertEquals(valorCampo, validavel.getValorCampo());
	}

	@Test
	public void numeroBigDecimalTest2() {
		BigDecimal valorCampo = new BigDecimal(10);
		BigDecimalValidavel<?> validavel = numero(nomeObjeto, nomeCampo, valorCampo);
		assertEquals(nomeObjeto, validavel.getNomeObjeto());
		assertEquals(nomeCampo, validavel.getNomeCampo());
		assertEquals(valorCampo, validavel.getValorCampo());
	}

	@Test
	public void numeroByteTest() {
		Byte valorCampo = new Byte((byte) 10);
		ByteValidavel<?> validavel = numero(nomeCampo, valorCampo);
		assertEquals(nomeCampo, validavel.getNomeCampo());
		assertEquals(valorCampo, validavel.getValorCampo());
	}

	@Test
	public void numeroByteTest2() {
		Byte valorCampo = new Byte((byte) 10);
		ByteValidavel<?> validavel = numero(nomeObjeto, nomeCampo, valorCampo);
		assertEquals(nomeObjeto, validavel.getNomeObjeto());
		assertEquals(nomeCampo, validavel.getNomeCampo());
		assertEquals(valorCampo, validavel.getValorCampo());
	}

	@Test
	public void numeroDoubleTest() {
		Double valorCampo = new Double(10.0D);
		DoubleValidavel<?> validavel = numero(nomeCampo, valorCampo);
		assertEquals(nomeCampo, validavel.getNomeCampo());
		assertEquals(valorCampo, validavel.getValorCampo());
	}

	@Test
	public void numeroDoubleTest2() {
		Double valorCampo = new Double(10.0D);
		DoubleValidavel<?> validavel = numero(nomeObjeto, nomeCampo, valorCampo);
		assertEquals(nomeObjeto, validavel.getNomeObjeto());
		assertEquals(nomeCampo, validavel.getNomeCampo());
		assertEquals(valorCampo, validavel.getValorCampo());
	}

	@Test
	public void numeroIntegerTest() {
		Integer valorCampo = new Integer(10);
		IntegerValidavel<?> validavel = numero(nomeCampo, valorCampo);
		assertEquals(nomeCampo, validavel.getNomeCampo());
		assertEquals(valorCampo, validavel.getValorCampo());
	}

	@Test
	public void numeroIntegerTest2() {
		Integer valorCampo = new Integer(10);
		IntegerValidavel<?> validavel = numero(nomeObjeto, nomeCampo, valorCampo);
		assertEquals(nomeObjeto, validavel.getNomeObjeto());
		assertEquals(nomeCampo, validavel.getNomeCampo());
		assertEquals(valorCampo, validavel.getValorCampo());
	}

	@Test
	public void numeroLongTest() {
		Long valorCampo = new Long(10);
		LongValidavel<?> validavel = numero(nomeCampo, valorCampo);
		assertEquals(nomeCampo, validavel.getNomeCampo());
		assertEquals(valorCampo, validavel.getValorCampo());
	}

	@Test
	public void numeroLongTest2() {
		Long valorCampo = new Long(10);
		LongValidavel<?> validavel = numero(nomeObjeto, nomeCampo, valorCampo);
		assertEquals(nomeObjeto, validavel.getNomeObjeto());
		assertEquals(nomeCampo, validavel.getNomeCampo());
		assertEquals(valorCampo, validavel.getValorCampo());
	}

	@Test
	public void numeroShortTest() {
		Short valorCampo = new Short((short) 10);
		ShortValidavel<?> validavel = numero(nomeCampo, valorCampo);
		assertEquals(nomeCampo, validavel.getNomeCampo());
		assertEquals(valorCampo, validavel.getValorCampo());
	}

	@Test
	public void numeroShortTest2() {
		Short valorCampo = new Short((short) 10);
		ShortValidavel<?> validavel = numero(nomeObjeto, nomeCampo, valorCampo);
		assertEquals(nomeObjeto, validavel.getNomeObjeto());
		assertEquals(nomeCampo, validavel.getNomeCampo());
		assertEquals(valorCampo, validavel.getValorCampo());
	}

	@Test
	public void textoTest() {
		String valorCampo = "valorCampo";
		StringValidavel<?> validavel = texto(nomeCampo, valorCampo);
		assertEquals(nomeCampo, validavel.getNomeCampo());
		assertEquals(valorCampo, validavel.getValorCampo());
	}

	@Test
	public void textoTest2() {
		String valorCampo = "valorCampo";
		StringValidavel<?> validavel = texto(nomeObjeto, nomeCampo, valorCampo);
		assertEquals(nomeObjeto, validavel.getNomeObjeto());
		assertEquals(nomeCampo, validavel.getNomeCampo());
		assertEquals(valorCampo, validavel.getValorCampo());
	}

	@Test
	public void dateTest() {
		Date valorCampo = new Date();
		DateValidavel<?> validavel = data(nomeCampo, valorCampo);
		assertEquals(nomeCampo, validavel.getNomeCampo());
		assertEquals(valorCampo, validavel.getValorCampo());
	}

	@Test
	public void dateTest2() {
		Date valorCampo = new Date();
		DateValidavel<?> validavel = data(nomeObjeto, nomeCampo, valorCampo);
		assertEquals(nomeObjeto, validavel.getNomeObjeto());
		assertEquals(nomeCampo, validavel.getNomeCampo());
		assertEquals(valorCampo, validavel.getValorCampo());
	}
}
