package com.example;

public class Producto {

   private  Integer id;
   private  String  nombre;
   private  Double precio;
   private Integer stock;

   public Producto() {
      this.id = null;
      this.id = null;
      this.nombre = null;
      this.precio = null;
      this.stock = null;
   }

   public Producto(Integer id, String nombre, Double precio, Integer stock) {
      this.id = id;
      this.nombre = nombre;
      this.precio = precio;
      this.stock = stock;
   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public Double getPrecio() {
      return precio;
   }

   public void setPrecio(Double precio) {
      this.precio = precio;
   }

   public Integer getStock() {
      return stock;
   }

   public void setStock(Integer stock) {
      this.stock = stock;
   }

   @Override
   public String toString() {
      return "Producto{" +
              "id=" + id +
              ", nombre='" + nombre + '\'' +
              ", precio=" + precio +
              ", stock=" + stock +
              '}';
   }
}
