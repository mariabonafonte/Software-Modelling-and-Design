package org.uma.mds.figuras.factory;

import org.uma.mds.figuras.product.Figura;
import org.uma.mds.figuras.product.Circulo;


public class CreadorCirculo extends CreadorFigura{
    /*El área de un círculo solo necesita una medida, así que defino este método
    que llamará al heredado (el de abajo)
     */
    public Figura crearFigura(int base){
        return crearFigura(base, base);
    }

    @Override
    public Figura crearFigura(int base, int medida2){
        return new Circulo(base);
    }
}
