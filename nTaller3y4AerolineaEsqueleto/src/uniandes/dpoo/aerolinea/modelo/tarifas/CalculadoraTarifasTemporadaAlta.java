package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaAlta extends CalculadoraTarifas {

    //ATRIBUTOS
    private static final int COSTO_POR_KM = 1000;

    //METODOS
    @Override
    public int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
        int costoBase = 0;

  
        return costoBase;
    }

    @Override
    public double calcularPorcentajeDescuento(Cliente cliente) {
       
        return 0.0;
    }
}
