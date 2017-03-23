package br.com.fiap.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Determina até quando a anotação estará presente (execução)
@Retention(RetentionPolicy.RUNTIME)
//Determina para quem serve a anotação (classe e metodo)
@Target({ElementType.TYPE,ElementType.METHOD}) 
public @interface Banco {

	String url();
	
}