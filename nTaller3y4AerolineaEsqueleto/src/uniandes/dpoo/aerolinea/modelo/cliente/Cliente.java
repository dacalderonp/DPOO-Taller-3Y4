package uniandes.dpoo.aerolinea.modelo.cliente;

import org.json.JSONObject;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

/**
 * Clase abstracta que representa a un cliente de la aerolínea.
 */
public abstract class Cliente {
    protected String nombreEmpresa;
    protected int tamanoEmpresa;

    public Cliente(String nombreEmpresa, int tamanoEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.tamanoEmpresa = tamanoEmpresa;
    }

    //public abstract String getTipoCliente();
    //public abstract String getIdentificador();
    //public abstract void agregarTiquete(Tiquete tiquete);
    public abstract int calcularValorTotalTiquetes();
    public abstract void usarTiquetes(Vuelo vuelo);

    public JSONObject salvarEnJSON() {
        JSONObject jobject = new JSONObject();
        jobject.put("nombreEmpresa", this.nombreEmpresa);
        jobject.put("tamanoEmpresa", this.tamanoEmpresa);
        return jobject;
    }

    public static Cliente cargarDesdeJSON(JSONObject cliente) {
        // Lógica para cargar desde JSON
        return null;  // Debes implementar esto según tus necesidades
    }
    
    //GETTERS
    public String getTipoCliente() {
    	return "";
    }
    
    public String getIdentificador() {
    	return "";
    }
    
    public void agregarTiquete(Tiquete tiquete) {
    	System.out.println(tiquete);
    }
    
}