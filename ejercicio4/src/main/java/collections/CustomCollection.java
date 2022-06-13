package collections;

public class CustomCollection<T>{
	
	T[] cliente;
	int index = 0;
	

	public CustomCollection(int size) {
		cliente = (T[]) new Object[size];
	}
	
	public void mostrar() {
		for(T d : cliente) {
			System.out.println(d);
		}
	}
	
	//agrega en la ultima posicion
	public void add(T c) {
		cliente[index] = c;
		index++;
	}
	
	//agregar en posicion especifica
	public void addS(int index, T c) {
		for(int i = 0; i < cliente.length ; i++) {
			if(cliente[i] == cliente[index]) {
				cliente[index] = c;
			}
		}
	}
	
	
	//obtiene el valor del indice indicado
	public T get(int index) {
		return cliente[index];
	}
	
	
	//reemplaza el valor en el indice indicado
	public T set(int index, T c) {
		cliente[index] = c;
		return cliente[index];
	}
	
	public T remove(int index) {
		cliente[index] = null;
		return cliente[index];
	}
	
}
