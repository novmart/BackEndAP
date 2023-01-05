/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfAng.mgb.Service;

import com.portfAng.mgb.Entity.Proyectos;
import com.portfAng.mgb.Repository.RProyectos;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyectos {
    @Autowired 
    RProyectos rProyectos; 
    
    public List<Proyectos> list(){
        return rProyectos.findAll(); 
    }
    
    public Optional<Proyectos> getOne(int id){
        return rProyectos.findById(id); 
    }
    
    public Optional<Proyectos> getByNombrePro(String nombrePro){
        return rProyectos.findByNombrePro(nombrePro);
    }
    
    public void save(Proyectos pro){
        rProyectos.save(pro); 
    }
    
    public void delete(int id){
        rProyectos.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rProyectos.existsById(id); 
    }
    
    public boolean existsByNombrePro(String nombrePro){
        return rProyectos.existsByNombrePro(nombrePro); 
    }
}
