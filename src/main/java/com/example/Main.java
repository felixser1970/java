package com.example;

public class Main {
    public static void main(String[] args) {
        Producto[]  lista  = {
                new Producto(1,"Patatas",5.49d,100),
                new Producto(2,"Lechugas",2d,100),
                new Producto(3,"Manzanas",2.5d,100),
                new Producto(4,"Naranjas",0.99d,100),
                new Producto(5,"Zanahorias",0.82,80)
        };

        if(lista.length > 0) {
            Double sumaProducto = 0.0d;
            Double precioMax = 0.0d;

            for ( Producto p : lista) {
                sumaProducto += (p.getPrecio() * p.getStock());
                precioMax = (p.getPrecio() > precioMax )? p.getPrecio() : precioMax;

            }

            System.out.println("SUMA DE PRECIOS = " + sumaProducto);
            System.out.println("MEDIA DE PRECIO = " + (sumaProducto / lista.length));
            System.out.println("PRECIO MÁXIMO = " + precioMax);
        }




    }
}
