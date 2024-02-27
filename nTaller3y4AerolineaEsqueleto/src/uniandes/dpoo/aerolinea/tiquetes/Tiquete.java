package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete {
    private String codigo;
    private Vuelo vuelo;
    private Cliente clienteComprador;
    private int tarifa;
    private boolean usado;

    // Constructor
    public Tiquete(String codigo, Vuelo vuelo, Cliente clienteComprador, int tarifa) {
        this.codigo = codigo;
        this.vuelo = vuelo;
        this.clienteComprador = clienteComprador;
        this.tarifa = tarifa;
        this.usado = false;
    }

    // Getters
    public Cliente getCliente() {
        return clienteComprador;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getTarifa() {
        return tarifa;
    }

    // Setter para marcar como usado
    public void marcarComoUsado() {
        this.usado = true;
    }

    // Método para verificar si está usado
    public boolean esUsado() {
        return usado;
    }
}
