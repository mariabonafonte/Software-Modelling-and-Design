package org.uma.mds.figuras;

import org.uma.mds.figuras.factory.CreadorCirculo;
import org.uma.mds.figuras.factory.CreadorRectangulo;
import org.uma.mds.figuras.factory.CreadorTriangulo;
import org.uma.mds.figuras.product.Circulo;
import org.uma.mds.figuras.product.Rectangulo;
import org.uma.mds.figuras.product.Triangulo;

public class Main {
    public static void main(String[] args) {
        //Creamos una fábrica de triángulos
        CreadorTriangulo fabricaTriangulos = new CreadorTriangulo();
        //Vamos a crear y dibujar unos cuantos triángulos:
        Triangulo triangulo1 = (Triangulo) fabricaTriangulos.crearFigura(5, 5);
        triangulo1.dibujar();
        Triangulo triangulo2 = (Triangulo) fabricaTriangulos.crearFigura(5, 7);
        triangulo2.dibujar();

        //Creamos una fábrica de rectángulos
        CreadorRectangulo fabricaRectangulos = new CreadorRectangulo();
        //Vamos a crear y dibujar unos cuantos rectángulos:
        Rectangulo rectangulo1 = (Rectangulo) fabricaRectangulos.crearFigura(2, 5);
        rectangulo1.dibujar();
        Rectangulo rectangulo2 = (Rectangulo) fabricaRectangulos.crearFigura(3, 7);
        rectangulo2.dibujar();

        //Creamos una fábrica de círculos
        CreadorCirculo fabricaCirculos = new CreadorCirculo();
        //Vamos a crear y dibujar unos cuantos rectángulos:
        Circulo circulo1 = (Circulo) fabricaCirculos.crearFigura(2);
        circulo1.dibujar();
        Circulo circulo2 = (Circulo) fabricaCirculos.crearFigura(4);
        circulo2.dibujar();
    }
}
