package br.com.fiap.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Determina at� quando a anota��o estar� presente (execu��o)
@Retention(RetentionPolicy.RUNTIME)
//Determina para quem serve a anota��o (classe e metodo)
@Target({ElementType.TYPE,ElementType.METHOD}) 
public @interface Banco {

	String url();
	
}