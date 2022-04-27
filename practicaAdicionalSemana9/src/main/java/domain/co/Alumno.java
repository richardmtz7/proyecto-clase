package domain.co;

public class Alumno {
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
	private int id;
	private String nombre;
	private String apellido;
	private int idCurso;
	
	
	//constructor vacio
	public Alumno() {
		
	}
	
	//constructor sin id
	public Alumno(String nombre, String apellido, int idCurso) {
		super();
		this.idCurso = idCurso;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	
	
	//Constructor parametrizado
	public Alumno(int id, String nombre, String apellido, int idCurso) {
		super();
		this.idCurso = idCurso;
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	//getters y setter 

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Alumno [number=" + id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
	
	
	
}
