/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfAng.mgb.Security.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author novel
 */
public class LoginUsuario {
    @NotBlank
    private String nombreUsuario; 
    @NotBlank
    private String password; 
    
    //get y set 

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
