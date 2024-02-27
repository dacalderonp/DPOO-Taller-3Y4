package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.Ruta;

public abstract class CalculadoraTarifas {

	//ATRIBUTOS
    protected static final double IMPUESTO = 0.28;

    
    //CONSTRUCTOR
    public int calcularTarifa(Vuelo vuelo, Cliente cliente) {
    	return 0;
    };

    //METODOS
    protected int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
        
        return 0;
    }

    protected double calcularPorcentajeDescuento(Cliente cliente) {
        
        return 0.0; 
    }

    protected int calcularDistanciaVuelo(Ruta ruta) {
        
        return 0;
    }

    protected int calcularValorImpuestos(int costoBase) {
        return (int) (IMPUESTO * costoBase);
    }
}

