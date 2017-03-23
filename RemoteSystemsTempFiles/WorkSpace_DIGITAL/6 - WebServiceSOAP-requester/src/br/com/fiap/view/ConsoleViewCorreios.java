package br.com.fiap.view;

import org.tempuri.CalcPrecoPrazoWSStub;
import org.tempuri.CalcPrecoPrazoWSStub.CalcPrazo;
import org.tempuri.CalcPrecoPrazoWSStub.CalcPrazoResponse;

public class ConsoleViewCorreios {

	public static void main(String[] args) {
		try {
			CalcPrecoPrazoWSStub bo = new CalcPrecoPrazoWSStub();

			CalcPrazo prazo = new CalcPrazo();
			prazo.setNCdServico("40010");
			prazo.setSCepDestino("06142195");
			prazo.setSCepOrigem("09860215");

			CalcPrazoResponse responde = bo.calcPrazo(prazo);

			String entrega = responde.getCalcPrazoResult().getServicos().getCServico()[0].getPrazoEntrega();

			System.out.println("Prazo de entrega: " + entrega);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
