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
public class Disco {
    private int codigo;
    private String nombre;
    private int anioDeLanzamiento;

    public Disco() {
    }

    public Disco(int codigo, String nombre, int anioDeLanzamiento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.anioDeLanzamiento = anioDeLanzamiento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioDeLanzamiento() {
        return anioDeLanzamiento;
    }

    public void setAnioDeLanzamiento(int anioDeLanzamiento) {
        this.anioDeLanzamiento = anioDeLanzamiento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Disco other = (Disco) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Disco{" + "Codigo=" + codigo + ", Nombre=" + nombre + ", AnioDeLanzamiento=" + anioDeLanzamiento + '}';
    }
}

/* public class Disco {
    private int codigo; 
    private String nombre; 
    private int anioDeLanzamiento; 

    public Disco() {
       
    }
    
    public Disco(int codigo, String nombre, int anioDeLanzamiento) {
        this.codigo = codigo; 
        this.nombre = nombre; 
        this.anioDeLanzamiento = anioDeLanzamiento; 
    }

    public int getCodigo() {
        return codigo; 
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo; 
    }

    public String getNombre() {
        return nombre; 
    }

    public void setNombre(String nombre) {
        this.nombre = nombre; 
    }

    public int getAnioDeLanzamiento() {
        return anioDeLanzamiento;
    }

    public void setAnioDeLanzamiento(int anioDeLanzamiento) {
        this.anioDeLanzamiento = anioDeLanzamiento; 
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7; 
        hash = 29 * hash + Objects.hashCode(this.nombre); 
        return hash; 
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { 
            return true;
        }
        if (obj == null) { 
            return false;
        }
        if (getClass() != obj.getClass()) { 
            return false;
        }
        final Disco other = (Disco) obj;
        if (Objects.equals(this.nombre, other.nombre)){ 
            return false;
        }
        return true; 
    }

    @Override
    public String toString() {
        return "\nDisco: " + "Codigo: " + codigo + "Nombre: " + nombre + "AnioDeLanzamiento: " + anioDeLanzamiento + '}'; 
    }
}

*/