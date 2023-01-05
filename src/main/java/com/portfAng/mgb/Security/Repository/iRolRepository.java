/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfAng.mgb.Security.Repository;

import com.portfAng.mgb.Security.Entity.Rol;
import com.portfAng.mgb.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;


@Repository 
public interface iRolRepository extends JpaRepositoryImplementation<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre); 
}
