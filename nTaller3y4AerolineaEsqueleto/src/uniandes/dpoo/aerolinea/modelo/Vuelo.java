package uniandes.dpoo.aerolinea.modelo;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo {
    private Ruta ruta;
    private String fecha;
    private Avion avion;
    private Set<Tiquete> tiquetes;

    // Constructor
    public Vuelo(Ruta ruta, String fecha, Avion avion) {
        this.ruta = ruta;
        this.fecha = fecha;
        this.avion = avion;
        this.tiquetes = new HashSet<>();
    }

    // Getters
    public Ruta getRuta() {
        return ruta;
    }

    public String getFecha() {
        return fecha;
    }

    public Avion getAvion() {
        return avion;
    }

    public Collection<Tiquete> getTiquetes() {
        return tiquetes;
    }

    // Setter para vender tiquetes
    public void venderTiquetes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            int tarifa = calculadora.calcularTarifa();  // Implementa la lógica de cálculo de tarifa
            Tiquete tiquete = new Tiquete(generarCodigo(), this, cliente, tarifa);
            tiquetes.add(tiquete);
        }
    }

    // Método para verificar igualdad
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Vuelo vuelo = (Vuelo) obj;
        return ruta.equals(vuelo.ruta) && fecha.equals(vuelo.fecha) && avion.equals(vuelo.avion);
    }

    // genera un código de tiquete 
    private String generarCodigo() {
        
        return "TIQ" + System.currentTimeMillis();
    }
}
