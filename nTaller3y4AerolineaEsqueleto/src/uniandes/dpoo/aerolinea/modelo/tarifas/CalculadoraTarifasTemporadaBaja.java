package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaBaja extends CalculadoraTarifas {

    // ATRIBUTOS
    private static final int COSTO_POR_KM_NATURAL = 600;
    private static final int COSTO_POR_KM_CORPORATIVO = 900;
    private static final double DESCUENTO_PEQ = 0.02;
    private static final double DESCUENTO_MEDIANAS = 0.1;
    private static final double DESCUENTO_GRANDES = 0.2;

    //METODOS
    @Override
    public int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
        int costoBase = 0;

        return costoBase;
    }

    @Override
    public double calcularPorcentajeDescuento(Cliente cliente) {
        double porcentajeDescuento = 0.0;


        return porcentajeDescuento;
    }
}
