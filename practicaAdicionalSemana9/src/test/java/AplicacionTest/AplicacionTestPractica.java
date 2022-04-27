package AplicacionTest;

import java.util.Scanner;

import javax.swing.JOptionPane;

import domain.co.Alumno;
import domain.co.Materia;
import domain.co.services.AlumnoServices;
import domain.co.services.MateriaServices;
import domain.co.services.Impl.AlumnoServicesImpl;
import domain.co.services.Impl.MateriaServiceImpl;

public class AplicacionTestPractica {
	/* Crear un branch con el nombre practica-adicional-semana9
	Crear una aplicación crud por consola:
	Crer una aplicación que permite gestionar la inscripción de alumnos a una materia asociada a un curso, turno.
	Para ello crear las siguientes clases: Alumno(matricula:number, nombre:string, apellido:string), Materia (id, Curso,Turno), Aplicacion, Menu,DatosDBMemoria.
	Los datos se deben leer desde teclado (de ser posible validar formato, ej: id es Long nombre de alumno es String)
	Recomendaciones:
	* crear la clase Menu lo cual permitirá mostrar las difrentes opciones de menú (inscribir, eliminar inscripcion, buscar inscripcion)
	- la clase Aplicacion que será el main de la aplicación: instanciará los objetos necesarios. ej: Menu, Alumno etc
	- la clase DatosDBMemoria que permitirá guardar internamente los datos en un array. Esta clase contendrá las inscripciones.
	Podemos agregarle métodos que faciliten la busqueda, inscripion, eliminacion.
	Incorporar Exceptions propias (mínimo dos) en la clase y método que considere necesario
	Puede crear mas clases de ser necesarias
	 * */

	public static void main(String[] args) {
	
		AlumnoServices services = new AlumnoServicesImpl();
		Alumno alumno = services.getOne(1l);
		alumno.setNombre("Richard");
		alumno.setApellido("Niño");
		alumno.setId(1);
		System.out.println(alumno);
		
		MateriaServices service = new MateriaServiceImpl();
		Materia materia = service.getOne(1l);
		materia.setCurso("Calculo");
		materia.setTurno(1);
		materia.setId(1);
		System.out.println(materia);
		
		
		
	}

}
