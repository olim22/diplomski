/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fon.silab.njt.diplomski.repository;

import fon.silab.njt.diplomski.domain.Dobavljac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Olja
 */
@Repository
public interface DobavljacRepository extends JpaRepository<Dobavljac, Object>{
    
}
