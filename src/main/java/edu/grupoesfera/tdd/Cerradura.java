package edu.grupoesfera.tdd;

public class Cerradura {

	private int contraseña  ;
	private boolean estaAbierta;
	public Cerradura(int clave, int intentos) {
		contraseña = clave;
	}
	
	public boolean abrir(int clave){
		if(contraseña == clave){
			estaAbierta = true;
			return true;
		}else
		{
			return false;
		}
	}

	public boolean estaAbierta() {

		return estaAbierta;
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
