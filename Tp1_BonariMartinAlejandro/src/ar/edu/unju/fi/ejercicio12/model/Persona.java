package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {
	private String nombrePersona;
	private Calendar fechaNacimiento;
	
	public Persona (String nombrePersona, Calendar fechaNacimiento) {
		this.nombrePersona = nombrePersona;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public int CalcularEdadPersona () {
		Calendar fechaActual = Calendar.getInstance();
		int EdadPersona = fechaActual.get(Calendar.YEAR)-fechaNacimiento.get(Calendar.YEAR);
		if (fechaActual.get(Calendar.DAY_OF_YEAR)<fechaNacimiento.get(Calendar.DAY_OF_YEAR)) {
			EdadPersona=EdadPersona-1;
		}
		return EdadPersona;
	}
	public String CalcularSignoZodiaco () {
		int mesNacimiento=fechaNacimiento.get(Calendar.MONTH);
		int diaNacimiento=fechaNacimiento.get(Calendar.DAY_OF_MONTH);
		String signoZodiaco="";
		switch (mesNacimiento) {
		 	case 0:
		 		if (diaNacimiento<=19) {
		 			signoZodiaco="Capricornio";
		 		}
		 		else {
		 			signoZodiaco="Acuario";
		 		}
		 		break;
		 	case 1:
		 		if (diaNacimiento<=18) {
		 			signoZodiaco="Acuario";
		 		}
		 		else {
		 			signoZodiaco="Piscis";
		 		}
		 		break;
		 	case 2:
		 		if (diaNacimiento<=20) {
		 			signoZodiaco="Piscis";
		 		}
		 		else {
		 			signoZodiaco="Aries";
		 		}
		 		break;
		 	case 3:
		 		if (diaNacimiento<=19) {
		 			signoZodiaco="Aries";
		 		}
		 		else {
		 			signoZodiaco="Tauro";
		 		}
		 		break;
		 	case 4:
		 		if (diaNacimiento<=20) {
		 			signoZodiaco="Tauro";
		 		}
		 		else {
		 			signoZodiaco="Geminis";
		 		}
		 		break;
		 	case 5:
		 		if (diaNacimiento<=20) {
		 			signoZodiaco="Geminis";
		 		}
		 		else {
		 			signoZodiaco="Cancer";
		 		}
		 		break;
		 	case 6:
		 		if (diaNacimiento<=22) {
		 			signoZodiaco="Cancer";
		 		}
		 		else {
		 			signoZodiaco="Leo";
		 		}
		 		break;
		 	case 7:
		 		if (diaNacimiento<=22) {
		 			signoZodiaco="Leo";
		 		}
		 		else {
		 			signoZodiaco="Virgo";
		 		}
		 		break;
		 	case 8:
		 		if (diaNacimiento<=22) {
		 			signoZodiaco="Virgo";
		 		}
		 		else {
		 			signoZodiaco="Libra";
		 		}
		 		break;
		 	case 9: 
		 		if (diaNacimiento<=22) {
		 			signoZodiaco="Libra";
		 		}
		 		else {
		 			signoZodiaco="Escorpio";
		 		}
		 		break;
		 	case 10: 
		 		if (diaNacimiento<=21) {
		 			signoZodiaco="Escorpio";
		 		}
		 		else {
		 			signoZodiaco="Sagitario";
		 		}
		 		break;
		 	case 11:
		 		if (diaNacimiento<=21) {
		 			signoZodiaco="Sagitario";
		 		}
		 		else {
		 			signoZodiaco="Capricornio";
		 		}
		 		break;
		}
		return signoZodiaco;
	}
	public String CalcularEstacion() {
		int mesNacimiento=fechaNacimiento.get(Calendar.MONTH);
		int diaNacimiento=fechaNacimiento.get(Calendar.DAY_OF_MONTH);
		String estacion="";
		if (mesNacimiento==11 && diaNacimiento>=21 || mesNacimiento==0 || mesNacimiento==1 || mesNacimiento==2 && diaNacimiento<=20){
			estacion="Verano";
		}
		else if (mesNacimiento==2 && diaNacimiento>20 || mesNacimiento==3 || mesNacimiento==4 || mesNacimiento==5 && diaNacimiento<=20) {
			estacion="Otoño";
		}
		else if (mesNacimiento==5 && diaNacimiento>20 || mesNacimiento==6 || mesNacimiento==7 || mesNacimiento==8 && diaNacimiento<=20) {
			estacion ="Invierno";
		}
		else if (mesNacimiento==8 && diaNacimiento>20 || mesNacimiento==9 || mesNacimiento==10 || mesNacimiento==11 && diaNacimiento<=20) {
			estacion="Primavera";
		}
		return estacion;
	}
}
