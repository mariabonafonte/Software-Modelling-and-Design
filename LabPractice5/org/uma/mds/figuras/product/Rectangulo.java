package org.uma.mds.figuras.product;

public class Rectangulo implements Figura {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un rectángulo de base " + ancho + " y altura " + alto);
        System.out.println("Su área es: " + area());
    }

    @Override
    public double area() {
        return ancho * alto;
    }
}