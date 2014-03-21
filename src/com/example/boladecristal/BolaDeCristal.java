package com.example.boladecristal;

import java.util.Random;

public class BolaDeCristal {
	//Variables miembro (propiedades del objeto)
	public String[] mRespuestas = {
			"Es casi seguro",
			"Es posible",
			"Toda las señales dicen SI",
			"Las estrellas no estan alineadas aun",
			"No lo creo",
			"Es muy poco probable",
			"Mejor no te lo digo ahora",
			"Concentrate y pregunta de nuevo",
			"No puedo responderte ahora"};
	
	//Metodos (habilidades: cosas que el objeto puede hacer)
	public String getUnaRespuesta(){
		
		String respuesta = "";
		
		//Selecciona una respuesta aleatoriamente (random): Si, No o Puede ser
		Random randomGenerador = new Random(); //Construye un nuevo generador de numero Random
		int randomNumber = randomGenerador.nextInt(mRespuestas.length);
		//respuesta = Integer.toString(randomNumber);
		
		respuesta = mRespuestas[randomNumber];
		
		return respuesta;
	}	
}
