package aplicacion;

import dominio.Avion;
import dominio.Helicoptero;
import dominio.Ovni;
import dominio.Superman;
import dominio.TorreDeControl;
import dominio.Voladores;

public class Main {
	public static void main(String[] args) {
		
		Avion avion = new Avion("boing", 700, "rolls", 2014, "BLlanco");
		Helicoptero helicoptero = new Helicoptero("Apache", 300, "Gris", "Mitsubichi", 2018);
		Ovni ovni = new Ovni("area51", 300000000, "verde", "desconocido", 2021);
		Superman superman = new Superman("Clarck", 2000, "Periodista", 32);
		Voladores[] volador = {avion,helicoptero,ovni,superman};
		
		TorreDeControl torre = new TorreDeControl(3, "Colombia", 4, volador);
		
		torre.aterrizar();
	}
}
