package edu.grupoesfera.tdd;

public class Cerradura {


	public Cerradura(int clave, int intentos) {
	}
	
	public boolean abrir(int clave){
		return true;
	}

	public boolean estaAbierta() {
		return false;
	}

	public void cerrar() {
	}

	public boolean estaCerrada() {
		return false;
	}

	public boolean estaBloqueada() {
		return true;
	}

	public int cantidadIntentosFallidos() {
		return -1;
	}
	
}
