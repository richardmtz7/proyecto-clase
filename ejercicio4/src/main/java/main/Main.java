package main;

import collections.CustomCollection;

public class Main {

	public static void main(String[] args) {
		
		CustomCollection<String> cc = new CustomCollection<String>(5);
		cc.add("Pedro");
		cc.add("Juan");
		//cc.mostrar();
		
		cc.addS(2, "Richard");
		//cc.mostrar();
		
		cc.set(2, "Rudolf");
		//cc.mostrar();
		
		cc.remove(2);
		cc.mostrar();
		
		
		
		
		
		
	}

}
