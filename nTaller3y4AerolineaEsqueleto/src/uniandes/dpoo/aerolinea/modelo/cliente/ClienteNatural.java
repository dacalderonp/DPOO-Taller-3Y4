package uniandes.dpoo.aerolinea.modelo.cliente;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class ClienteNatural extends Cliente{
	private static String NATURAL = "Natural";
	private String nombre;
	

    public ClienteNatural(String nombre, String nombreEmpresa, int tamanoEmpresa) {
        super(nombreEmpresa, tamanoEmpresa);
        this.nombre = nombre;
    }

	
	//GETTERS
    public String getIdentificador() {
        
        return nombre;
    }
	

	@Override
	public String getTipoCliente() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getIdentificacion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void agregarTiquete(Tiquete tiquete) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int calcularValorTotalTiquetes() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void usarTiquetes(Vuelo vuelo) {
		// TODO Auto-generated method stub
		
	}
}
