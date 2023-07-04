/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica.Nieves.Chuquipoma.modelo;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */



 public class Compositor extends Persona {
    
    private int numeroDeComposiciones;
    
    private List<Cancion> cancionesTop100Billboard;
  
    private List<Cantante> cliente;
  
    
    public Compositor() {
        cliente = new ArrayList();
        cancionesTop100Billboard = new ArrayList();
    }
   
    
    public Compositor(int numeroDeComposiciones, int codigo, String nombre, String apellido, int edad, String nacionalidad, double salario) {
      
        super(codigo, nombre, apellido, edad, nacionalidad, salario);
       
        this.numeroDeComposiciones = numeroDeComposiciones;
       
        
        cliente = new ArrayList();
        cancionesTop100Billboard = new ArrayList();
       
    }

    

    @Override
    public double calcularSalario() {
      
        double salarioFinal = getSalario();
   
        if (numeroDeComposiciones > 5) {
            double regalia = 300;
           
            salarioFinal += regalia;
           
        }
        if (cancionesTop100Billboard.size() >= 1 && cancionesTop100Billboard.size() <= 3) {
            double c = salarioFinal * 0.10;
           
            salarioFinal += c;
           
        }
        if (cancionesTop100Billboard.size() >=4 && cancionesTop100Billboard.size() <= 6){ 
            double d = salarioFinal * 0.20;
            salarioFinal += d;
        }
        if(cancionesTop100Billboard.size() > 6){ 
            double e = salarioFinal * 0.20;
            salarioFinal += e;
        }
        return salarioFinal; 
    }    

    public void agregarCancion(Cancion listcan){ 
       
        cancionesTop100Billboard.add(listcan); 
    }
    public Cancion buscarCancione(int codigo){
        for (Cancion cancion : cancionesTop100Billboard) {
            if (cancion.getCodigo()==codigo) {
                return  cancion;
            }
        }
        return null;
    }
    public List<Cancion> listaCanciones(){
        return cancionesTop100Billboard;
    }
    
    public void agregarClientE(Cantante clientes) { 
        cliente.add(clientes); 
    }
    
    public void actualizarCancion(Cancion cancionActualizada) {
        int codigoCancion = cancionActualizada.getCodigo();
        for (Cancion cancion : cancionesTop100Billboard) {
            if (cancion.getCodigo() == codigoCancion) {
                cancion.setTitulo(cancionActualizada.getTitulo());
                cancion.setLetra(cancionActualizada.getLetra());
                cancion.setTiempoEnMinutos(cancionActualizada.getTiempoEnMinutos());
                //System.out.println("Canción actualizada correctamente.");
                return;
            }
        }
        //System.out.println("El código de canción no se encontró en el top 100 de Billboard.");
    }
    

    public void eliminarCancion(int codigoCancion) {
        for (Cancion cancion : cancionesTop100Billboard) {
            if (cancion.getCodigo() == codigoCancion) {
                cancionesTop100Billboard.remove(cancion);
                System.out.println("Canción eliminada correctamente.");
                return;
            }
        }
        System.out.println("El código de canción no se encontró en el top 100 de Billboard.");
    }


    public int getNumeroDeComposiciones() { 
        return numeroDeComposiciones;
    }

    public void setNumeroDeComposiciones(int numeroDeComposiciones) {
        this.numeroDeComposiciones = numeroDeComposiciones;
    }

    public List<Cancion> getCancionesTop100Billboard() { 
        return cancionesTop100Billboard;
    }

    public void setCancionesTop100Billboard(List<Cancion> cancionesTop100Billboard) { 
        this.cancionesTop100Billboard = cancionesTop100Billboard;
    }

    public List<Cantante> getCliente() { 
        return cliente;
    }

    public void setCliente(List<Cantante> cliente) { 
        this.cliente = cliente;
    }

    @Override
    public String toString() { 
        return "Compositor " + super.toString()  + "\nNumeroDeComposiciones=" + numeroDeComposiciones + "\nCancionesTop100Billboard: " + cancionesTop100Billboard + "\nClientes : " + cliente ;
    }    

   
}

