package org.uma.mds.figuras.factory;

import org.uma.mds.figuras.product.Figura;
import org.uma.mds.figuras.product.Triangulo;

public class CreadorTriangulo extends CreadorFigura{
    @Override
    public Figura crearFigura(int base, int altura){
        return new Triangulo(base, altura);
    }
}
