package org.uma.mds.figuras.factory;

import org.uma.mds.figuras.product.Figura;
import org.uma.mds.figuras.product.Rectangulo;


public class CreadorRectangulo extends CreadorFigura{
    @Override
    public Figura crearFigura(int base, int altura){
        return new Rectangulo(base, altura);
    }
}
