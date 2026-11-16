package org.uma.mds.figuras.factory;

import org.uma.mds.figuras.product.Figura;

public abstract class CreadorFigura {
    //Método fábrica (abstracto)
    public abstract Figura crearFigura(int medida1, int medida2);

    //Métodos que usan el objeto creado
    public void dibujaFigura(int medida1, int medida2){
        Figura figura = crearFigura(medida1,medida2);
        figura.dibujar();
    }
}
