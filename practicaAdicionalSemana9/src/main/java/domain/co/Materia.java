package domain.co;

public class Materia {
	/*
	 * Para ello crear las siguientes clases: Materia (id, Curso,Turno), Aplicacion, Menu,DatosDBMemoria.
	Los datos se deben leer desde teclado (de ser posible validar formato, ej: id es Long nombre de alumno es String)
	 * */
	private int id;
	private String curso;
	private int turno;
	
	//constructor vacio
	public Materia() {
		
	}
	
	//construcor sin id
	public Materia(String curso, int turno) {
		super();
		this.curso = curso;
		this.turno = turno;
	}
	
	//constructor parametrizado 
	public Materia(int id, String curso, int turno) {
		super();
		this.id = id;
		this.curso = curso;
		this.turno = turno;
	}
	
	//getters y setters 
	
	

	public String getCurso() {
		return curso;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}


	public int getTurno() {
		return turno;
	}


	public void setTurno(int turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Materia [id=" + id + ", curso=" + curso + ", turno=" + turno + "]";
	}
	
	
	
	
}
