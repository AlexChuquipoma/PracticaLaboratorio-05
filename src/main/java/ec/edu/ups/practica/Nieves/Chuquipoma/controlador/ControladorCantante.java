/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica.Nieves.Chuquipoma.controlador;

import ec.edu.ups.practica.Nieves.Chuquipoma.idao.ICantanteDao;
import ec.edu.ups.practica.Nieves.Chuquipoma.modelo.Cantante;
import ec.edu.ups.practica.Nieves.Chuquipoma.modelo.Disco;
import java.util.List;

/**
 *
 * @author Usuario
 */

public class ControladorCantante {

    private Cantante cantante;
    private Disco disco;
    private ICantanteDao cantanteDao;
    
    public ControladorCantante(ICantanteDao cantanteDao) {
        this.cantanteDao = cantanteDao;
  
    }
    
    public void registrar(Cantante cantante) {
        cantanteDao.create(cantante);
   
    }
    
    public void actualizar(Cantante cantante) {
        cantanteDao.update(cantante);
        
    }

    public void eliminar(Cantante cantante) {
        cantanteDao.delete(cantante);
    }
    
    public Cantante buscarCantante(int id) {
        return cantanteDao.read(id);
    }

    public List<Cantante> verCantantes() {
        return cantanteDao.findAll();
        
    }
    
    public Disco buscarporDisco(String nombre){
        return cantanteDao.buscarPorNombreDeDisco(nombre);
    }
    
    public void eliminarDisco(Cantante cantante,int codigo){
        List<Disco> listaDiscos=cantante.getDiscos();
        for (Disco listaDisco : listaDiscos) {
            if (listaDisco.getCodigo()==codigo) {
                cantante.eliminarDisco(codigo);
                cantanteDao.update(cantante);
            }
        }
    }
    
    public void actualizarDisco(Cantante cantante,Disco disco){
        cantante.actualizarDisco(disco);
        cantanteDao.update(cantante); 
    }
}

