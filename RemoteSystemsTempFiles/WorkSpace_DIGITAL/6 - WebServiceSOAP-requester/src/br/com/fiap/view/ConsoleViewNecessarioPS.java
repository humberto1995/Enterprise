package br.com.fiap.view;

import java.util.Scanner;

import br.com.fiap.bo.CursoBOStub;
import br.com.fiap.bo.CursoBOStub.CalculaPS;
import br.com.fiap.bo.CursoBOStub.CalculaPSResponse;

public class ConsoleViewNecessarioPS {

	public static void main(String[] args) {
		try {
			Scanner entrada = new Scanner(System.in);
			CursoBOStub bo = new CursoBOStub();

			// Valores para enviar ao WebService
			CalculaPS valores = new CalculaPS();
			System.out.print("Informe a média da NAC: ");
			double nac = entrada.nextDouble();
			valores.setNac(nac);
			// valores.setNac(nac);
			System.out.print("Informe a nota da AM: ");
			double am = entrada.nextDouble();
			valores.setAm(am);
			// valores.setAm(5);

			// Chamar o WebService
			CalculaPSResponse response = bo.calculaPS(valores);

			// Recuperar o valor retornado pelo WebService
			double ps = response.get_return();

			System.out.print("Nota necessária na PS: " + ps);
			System.exit(0);
		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
