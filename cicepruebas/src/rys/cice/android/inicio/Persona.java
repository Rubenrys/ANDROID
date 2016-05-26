package rys.cice.android.inicio;


public class Persona extends Registro implements CRUD {
	
	private String nombre;
	private int edad;
	
	public int getEdad(String nombre)
	
	{
	return edad;	
	}
	
	public int getNombre()
	
	{
	 return nombre;	
	}

	@Override
	public boolean escribirBaseDatos(Registro registro) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Registro leerBaseDato(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean borrarBaseDatos(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean actualizarBaseDatos(Registro registro) {
		// TODO Auto-generated method stub
		return false;
	}	

}
