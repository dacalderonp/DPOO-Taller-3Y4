package uniandes.dpoo.aerolinea.modelo.cliente;

import org.json.JSONObject;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

/**
 * Esta clase se usa para representar a los clientes de la aerolínea que son empresas
 */
public class ClienteCorporativo extends Cliente
{
    

	private static final String CORPORATIVO = "Corporativo";
    private static final int GRANDE = 1;
    private static final int MEDIANA = 2;
    private static final int PEQUENA = 3;
    private String nombreEmpresa;
    private int tamanoEmpresa;
	
    // TODO completar
    public ClienteCorporativo(String nombreEmpresa, int tamanoEmpresa) {
		super(nombreEmpresa, tamanoEmpresa);
		// TODO Auto-generated constructor stub
	}
    /**
     * Crea un nuevo objeto de tipo a partir de un objeto JSON.
     * 
     * El objeto JSON debe tener dos atributos: nombreEmpresa (una cadena) y tamanoEmpresa (un número).
     * @param cliente El objeto JSON que contiene la información
     * @return El nuevo objeto inicializado con la información
     */
    public static ClienteCorporativo cargarDesdeJSON( JSONObject cliente )
    {
        String nombreEmpresa = cliente.getString( "nombreEmpresa" );
        int tam = cliente.getInt( "tamanoEmpresa" );
        return new ClienteCorporativo(nombreEmpresa, tam);
    }

    /**
     * Salva este objeto de tipo ClienteCorporativo dentro de un objeto JSONObject para que ese objeto se almacene en un archivo
     * @return El objeto JSON con toda la información del cliente corporativo
     */
    public JSONObject salvarEnJSON( )
    {
        JSONObject jobject = new JSONObject( );
        jobject.put( "nombreEmpresa", this.nombreEmpresa );
        jobject.put( "tamanoEmpresa", this.tamanoEmpresa );
        jobject.put( "tipo", CORPORATIVO );
        return jobject;
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
	
	//GETTERS
	
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	
	public int getTamanoEmpresa() {
		return tamanoEmpresa;
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
