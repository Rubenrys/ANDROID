package rys.cice.android.inicio;

public interface CRUD {
	
	//CREATE READ UPDATE DELETE
	
	boolean escribirBaseDatos(Registro registro);
	Registro leerBaseDato(int id);
	boolean borrarBaseDatos(int id);
	boolean actualizarBaseDatos ( Registro registro);
}
