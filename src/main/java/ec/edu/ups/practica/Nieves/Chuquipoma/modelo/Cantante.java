/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica.Nieves.Chuquipoma.modelo;



/**
 *
 * @author Usuario
 */ 

import java.util.ArrayList;
import java.util.List;

public class Cantante extends Persona {

    private String nombreArtistico;
    private String generoMusical;
    private int numeroDeSencillos;
    private int numeroDeConciertos;
    private int numeroDeGiras;
    private List<Disco> discografia;

    public Cantante() {
        discografia = new ArrayList<>();
    }

    public Cantante(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
        discografia = new ArrayList<>();
    }

    public Cantante(int codigo, String nombre, String apellido, int edad, String nacionalidad) {
        super(codigo, nombre, apellido, edad, nacionalidad);
        discografia = new ArrayList<>();
    }

    public Cantante(String nombreArtistico, String generoMusical, int numeroDeSencillos, int numeroDeConciertos, int numeroDeGiras, int codigo, String nombre, String apellido, int edad, String nacionalidad, double salario) {
        super(codigo, nombre, apellido, edad, nacionalidad, salario);
        this.nombreArtistico = nombreArtistico;
        this.generoMusical = generoMusical;
        this.numeroDeSencillos = numeroDeSencillos;
        this.numeroDeConciertos = numeroDeConciertos;
        this.numeroDeGiras = numeroDeGiras;
        discografia = new ArrayList<>();
    }

    @Override
    public double calcularSalario() {
        double salarioFinal = getSalario();

        if (numeroDeSencillos > 10 && numeroDeGiras > 3) {
            int comision = 1000;
            salarioFinal += comision;
        }
        if (numeroDeSencillos >= 1 && numeroDeSencillos <= 10) {
            double f = salarioFinal * 0.05;
            salarioFinal += f;
        }
        if (numeroDeGiras >= 1 && numeroDeGiras <= 3) {
            double g = salarioFinal * 0.03;
            salarioFinal += g;
        }
        if (discografia.size() >= 5) {
            int bono = 2000;
            salarioFinal += bono;
        }
        return salarioFinal;
    }

    public void agregarDisco(Disco discografi) {
        discografia.add(discografi);
    }

    public Disco buscarDisco(int codigo) {
        for (Disco disco : discografia) {
            if (disco.getCodigo() == codigo) {
                return disco;
            }
        }
        return null;
    }

    public List<Disco> listarDiscos() {
        return discografia;
    }

    public void actualizarDisco(Disco discoActualizado) {
        for (int i = 0; i < discografia.size(); i++) {
            Disco disco = discografia.get(i);
            if (disco.getCodigo() == discoActualizado.getCodigo()) {
                disco.setNombre(discoActualizado.getNombre());
                disco.setAnioDeLanzamiento(discoActualizado.getAnioDeLanzamiento());
                System.out.println("Disco actualizado correctamente.");
                return;
            }
        }
        System.out.println("El disco no se encontró en la lista.");
    }

    public void eliminarDisco(int codigoDisco) {
        for (int i = 0; i < discografia.size(); i++) {
            Disco disco = discografia.get(i);
            if (disco.getCodigo() == codigoDisco) {
                discografia.remove(i);
                System.out.println("Disco eliminado correctamente.");
                return;
            }
        }
        System.out.println("El disco con el código especificado no se encontró en la discografía.");
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public int getNumeroDeSencillos() {
        return numeroDeSencillos;
    }

    public void setNumeroDeSencillos(int numeroDeSencillos) {
        this.numeroDeSencillos = numeroDeSencillos;
    }

    public int getNumeroDeConciertos() {
        return numeroDeConciertos;
    }

    public void setNumeroDeConciertos(int numeroDeConciertos) {
        this.numeroDeConciertos = numeroDeConciertos;
    }

    public int getNumeroDeGiras() {
        return numeroDeGiras;
    }

    public void setNumeroDeGiras(int numeroDeGiras) {
        this.numeroDeGiras = numeroDeGiras;
    }

    public List<Disco> getDiscos() {
        return discografia;
    }

    public void setDiscos(List<Disco> discos) {
        this.discografia = discos;
    }

    @Override
    public String toString() {
        return "Cantante " + super.toString() + "\nNombreArtistico: " + nombreArtistico + "\nGeneroMusical=" + generoMusical + "\nNumeroDeSencillos=" + numeroDeSencillos + "\nNumeroDeConciertos=" + numeroDeConciertos + "\nNumeroDeGiras=" + numeroDeGiras + "\nLista de Discos: " + discografia;
    }
}



/* public class Cantante extends Persona { 

    private String nombreArtistico; 
    private String generoMusical; 
    private int numeroDeSencillos; 
    private int numeroDeConciertos; 
    private int numeroDeGiras; 
    private List<Disco> discografia; 

    public Cantante() { 
        discografia = new ArrayList(); 
    }

    public Cantante(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    
    
    public Cantante(int codigo, String nombre, String apellido, int edad, String nacionalidad) {
        super(codigo, nombre, apellido, edad, nacionalidad);
    }

    
    
    public Cantante(String nombreArtistico, String generoMusical, int numeroDeSencillos, int numeroDeConciertos, int numeroDeGiras,  int codigo, String nombre, String apellido, int edad, String nacionalidad, double salario) { 
        super(codigo, nombre, apellido, edad, nacionalidad, salario); 
        this.nombreArtistico = nombreArtistico; 
        this.generoMusical = generoMusical; 
        this.numeroDeSencillos = numeroDeSencillos; 
        this.numeroDeConciertos = numeroDeConciertos; 
        this.numeroDeGiras = numeroDeGiras; 
        discografia = new ArrayList();
    }
 
    @Override
    public double calcularSalario() { 
        double salarioFinal = getSalario(); 

        if (numeroDeSencillos > 10 && numeroDeGiras > 3) { 
            int comision = 1000; 
            salarioFinal += comision; 
        }
        if (numeroDeSencillos >= 1 && numeroDeSencillos <= 10) { 
            double f = salarioFinal * 0.05; 
            salarioFinal += f; 
        }
        if (numeroDeGiras >= 1 && numeroDeGiras <= 3) { 
            double g = salarioFinal * 0.03; 
            salarioFinal += g; // 
        }
        if (discografia.size() >= 5) {
            int bono = 2000; 
            salarioFinal += bono; 
        }
        return salarioFinal; 
    }

    
    public void agregarDisco(Disco discografi){
        discografia.add(discografi); 
    }
    public Disco buscarDisco(int codigo){
        for (Disco disco : discografia) {
            if (disco.getCodigo()== codigo) {
                return disco;
            }
        }
        return null;
    }
    
    public List<Disco> listarDiscos(){
        return discografia;
    }
    public void actualizarDisco(Disco discoActualizado) {
        for (Disco disco : discografia) {
            if (disco.getCodigo() == discoActualizado.getCodigo()) {
                disco.setNombre(discoActualizado.getNombre());
                disco.setAnioDeLanzamiento(discoActualizado.getAnioDeLanzamiento());
                System.out.println("Disco actualizado correctamente.");
                return;
            }
        }
        System.out.println("El disco no se encontró en la lista.");
    }

    public void eliminarDisco(int codigoDisco) {
        Disco discoAEliminar = null;
        for (Disco disco : discografia) {
            if (disco.getCodigo() == codigoDisco) {
                discoAEliminar = disco;
                break;
            }
        }

        if (discoAEliminar != null) {
            discografia.remove(discoAEliminar);
            System.out.println("Disco eliminado correctamente.");
        } else {
            System.out.println("El disco con el código especificado no se encontró en la discografía.");
        }
    }
    
    public String getNombreArtistico() {
        return nombreArtistico; 
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico; 
    }

    public String getGeneroMusical() {
        return generoMusical; 
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public int getNumeroDeSencillos() {
        return numeroDeSencillos; 
    }

    public void setNumeroDeSencillos(int numeroDeSencillos) {
        this.numeroDeSencillos = numeroDeSencillos; 
    }

    public int getNumeroDeConciertos() {
        return numeroDeConciertos; 
    }

    public void setNumeroDeConciertos(int numeroDeConciertos) {
        this.numeroDeConciertos = numeroDeConciertos; 
    }

    public int getNumeroDeGiras() {
        return numeroDeGiras; 
    }

    public void setNumeroDeGiras(int numeroDeGiras) {
        this.numeroDeGiras = numeroDeGiras; 
    }

    public List<Disco> getDiscos() {
        return discografia; 
    }

    public void setDiscos(List<Disco> discos) {
        this.discografia = discos; 
    }

    
    @Override
    public String toString() {
        return "Cantante"+ super.toString()  + "\nNombreArtistico:" + nombreArtistico + "\nGeneroMusical=" + generoMusical + "\nNumeroDeSencillos=" + numeroDeSencillos + "\nNumeroDeConciertos=" + numeroDeConciertos + "\nNumeroDeGiras=" + numeroDeGiras + "\nLista de Discos: " + discografia ;
    }  

    
} */ 