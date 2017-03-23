package br.com.fiap.teste;

import java.lang.reflect.Method;

import br.com.fiap.annotation.Banco;
import br.com.fiap.factory.ConnectionFactory;

public class Teste {

	public static void main(String[] args) {
		
		Method[] metodos =
				ConnectionFactory.class.getDeclaredMethods();
		for (Method method : metodos) {
			//Imprimi o nome do m�todo
			System.out.println(method.getName());
			//Recuperar a anota��o Banco
			Banco anotacao = method.getAnnotation(Banco.class);
			//Imprimir o valor da url da anota��o
			System.out.println(anotacao.url());
		} 
		
		//Recuperar a anota��o da classe
		Banco anotacao = 
			ConnectionFactory.class.getAnnotation(Banco.class);
		System.out.println(anotacao.url());
		
	}
	
}
