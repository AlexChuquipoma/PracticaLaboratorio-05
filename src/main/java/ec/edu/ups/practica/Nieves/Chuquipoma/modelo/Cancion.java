/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica.Nieves.Chuquipoma.modelo;

import java.util.Objects;

/**
 *
 * @author Usuario
 */
public class Cancion {
    private int codigo;
    private String titulo;
    private String letra;
    private double tiempoEnMinutos;

    public Cancion() {
    }

    public Cancion(int codigo, String titulo, String letra, double tiempoEnMinutos) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.letra = letra;
        this.tiempoEnMinutos = tiempoEnMinutos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo > 0) {
            this.codigo = codigo;
        } else {
            System.out.println("El código debe ser un valor positivo.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public double getTiempoEnMinutos() {
        return tiempoEnMinutos;
    }

    public void setTiempoEnMinutos(double tiempoEnMinutos) {
        this.tiempoEnMinutos = tiempoEnMinutos;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.titulo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Cancion other = (Cancion) obj;
        return Objects.equals(this.titulo, other.titulo);
    }

    @Override
    public String toString() {
        return "\nCancion: " + "\nCodigo: " + codigo + "\nTitulo=" + titulo + "\nLetra=" + letra + "\nTiempoEnMinutos=" + tiempoEnMinutos + '}';
    }
}

/*public class Cancion {

    private int codigo;
    private String titulo;
    private String letra;
    private double tiempoEnMinutos;

    public Cancion() {
    }

    public Cancion(int codigo, String titulo, String letra, double tiempoEnMinutos) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.letra = letra;
        this.tiempoEnMinutos = tiempoEnMinutos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public double getTiempoEnMinutos() {
        return tiempoEnMinutos;
    }

    public void setTiempoEnMinutos(double tiempoEnMinutos) {
        this.tiempoEnMinutos = tiempoEnMinutos;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.titulo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) { // Método que compara si dos objetos son iguales
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cancion other = (Cancion) obj;
        return Objects.equals(this.titulo, other.titulo);
    }

    @Override
    public String toString() {
        return "\nCancion: " + "\nCodigo: " + codigo + "\nTitulo=" + titulo + "\nLetra=" + letra + "\nTiempoEnMinutos=" + tiempoEnMinutos + '}';
    }
}
*/