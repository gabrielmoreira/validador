package com.validador;

import static com.validador.Campos.*;
import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import com.validador.validavel.BigDecimalValidavel;
import com.validador.validavel.ByteValidavel;
import com.validador.validavel.DoubleValidavel;
import com.validador.validavel.IntegerValidavel;
import com.validador.validavel.LongValidavel;
import com.validador.validavel.ShortValidavel;
import com.validador.validavel.StringValidavel;

public class CamposTest {

	@Test
	public void instanceTest() {
		Campos camposInstance = new Campos();
		assertNotNull(camposInstance);
	}

	@Test
	public void numeroBigDecimalTest() {
		String nomeCampo = "NomeDoCampo";
		BigDecimal valorCampo = new BigDecimal(10);
		BigDecimalValidavel<?> validavel = numero(nomeCampo, valorCampo);
		assertEquals(nomeCampo, validavel.getNomeCampo());
		assertEquals(valorCampo, validavel.getValorCampo());
	}

	@Test
	public void numeroBigDecimalTest2() {
		String nomeObjeto = "NomeDoObjeto";
		String nomeCampo = "NomeDoCampo";
		BigDecimal valorCampo = new BigDecimal(10);
		BigDecimalValidavel<?> validavel = numero(nomeObjeto, nomeCampo, valorCampo);
		assertEquals(nomeObjeto, validavel.getNomeObjeto());
		assertEquals(nomeCampo, validavel.getNomeCampo());
		assertEquals(valorCampo, validavel.getValorCampo());
	}

	@Test
	public void numeroByteTest() {
		String nomeCampo = "NomeDoCampo";
		Byte valorCampo = new Byte((byte) 10);
		ByteValidavel<?> validavel = numero(nomeCampo, valorCampo);
		assertEquals(nomeCampo, validavel.getNomeCampo());
		assertEquals(valorCampo, validavel.getValorCampo());
	}

	@Test
	public void numeroByteTest2() {
		String nomeObjeto = "NomeDoObjeto";
		String nomeCampo = "NomeDoCampo";
		Byte valorCampo = new Byte((byte) 10);
		ByteValidavel<?> validavel = numero(nomeObjeto, nomeCampo, valorCampo);
		assertEquals(nomeObjeto, validavel.getNomeObjeto());
		assertEquals(nomeCampo, validavel.getNomeCampo());
		assertEquals(valorCampo, validavel.getValorCampo());
	}

	@Test
	public void numeroDoubleTest() {
		String nomeCampo = "NomeDoCampo";
		Double valorCampo = new Double(10.0D);
		DoubleValidavel<?> validavel = numero(nomeCampo, valorCampo);
		assertEquals(nomeCampo, validavel.getNomeCampo());
		assertEquals(valorCampo, validavel.getValorCampo());
	}

	@Test
	public void numeroDoubleTest2() {
		String nomeObjeto = "NomeDoObjeto";
		String nomeCampo = "NomeDoCampo";
		Double valorCampo = new Double(10.0D);
		DoubleValidavel<?> validavel = numero(nomeObjeto, nomeCampo, valorCampo);
		assertEquals(nomeObjeto, validavel.getNomeObjeto());
		assertEquals(nomeCampo, validavel.getNomeCampo());
		assertEquals(valorCampo, validavel.getValorCampo());
	}

	@Test
	public void numeroIntegerTest() {
		String nomeCampo = "NomeDoCampo";
		Integer valorCampo = new Integer(10);
		IntegerValidavel<?> validavel = numero(nomeCampo, valorCampo);
		assertEquals(nomeCampo, validavel.getNomeCampo());
		assertEquals(valorCampo, validavel.getValorCampo());
	}

	@Test
	public void numeroIntegerTest2() {
		String nomeObjeto = "NomeDoObjeto";
		String nomeCampo = "NomeDoCampo";
		Integer valorCampo = new Integer(10);
		IntegerValidavel<?> validavel = numero(nomeObjeto, nomeCampo, valorCampo);
		assertEquals(nomeObjeto, validavel.getNomeObjeto());
		assertEquals(nomeCampo, validavel.getNomeCampo());
		assertEquals(valorCampo, validavel.getValorCampo());
	}

	@Test
	public void numeroLongTest() {
		String nomeCampo = "NomeDoCampo";
		Long valorCampo = new Long(10);
		LongValidavel<?> validavel = numero(nomeCampo, valorCampo);
		assertEquals(nomeCampo, validavel.getNomeCampo());
		assertEquals(valorCampo, validavel.getValorCampo());
	}

	@Test
	public void numeroLongTest2() {
		String nomeObjeto = "NomeDoObjeto";
		String nomeCampo = "NomeDoCampo";
		Long valorCampo = new Long(10);
		LongValidavel<?> validavel = numero(nomeObjeto, nomeCampo, valorCampo);
		assertEquals(nomeObjeto, validavel.getNomeObjeto());
		assertEquals(nomeCampo, validavel.getNomeCampo());
		assertEquals(valorCampo, validavel.getValorCampo());
	}

	@Test
	public void numeroShortTest() {
		String nomeCampo = "NomeDoCampo";
		Short valorCampo = new Short((short) 10);
		ShortValidavel<?> validavel = numero(nomeCampo, valorCampo);
		assertEquals(nomeCampo, validavel.getNomeCampo());
		assertEquals(valorCampo, validavel.getValorCampo());
	}

	@Test
	public void numeroShortTest2() {
		String nomeObjeto = "NomeDoObjeto";
		String nomeCampo = "NomeDoCampo";
		Short valorCampo = new Short((short) 10);
		ShortValidavel<?> validavel = numero(nomeObjeto, nomeCampo, valorCampo);
		assertEquals(nomeObjeto, validavel.getNomeObjeto());
		assertEquals(nomeCampo, validavel.getNomeCampo());
		assertEquals(valorCampo, validavel.getValorCampo());
	}

	@Test
	public void numeroStringTest() {
		String nomeCampo = "NomeDoCampo";
		String valorCampo = "valorCampo";
		StringValidavel<?> validavel = texto(nomeCampo, valorCampo);
		assertEquals(nomeCampo, validavel.getNomeCampo());
		assertEquals(valorCampo, validavel.getValorCampo());
	}

	@Test
	public void numeroStringTest2() {
		String nomeObjeto = "NomeDoObjeto";
		String nomeCampo = "NomeDoCampo";
		String valorCampo = "valorCampo";
		StringValidavel<?> validavel = texto(nomeObjeto, nomeCampo, valorCampo);
		assertEquals(nomeObjeto, validavel.getNomeObjeto());
		assertEquals(nomeCampo, validavel.getNomeCampo());
		assertEquals(valorCampo, validavel.getValorCampo());
	}
}
