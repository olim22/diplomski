/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fon.silab.njt.diplomski.repository;

import fon.silab.njt.diplomski.domain.Sluzbenik;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Olja
 */
@Repository
public interface SluzbenikRepository extends CrudRepository<Sluzbenik, Long>{
    
    @Query("SELECT s FROM Sluzbenik s WHERE s.username = :username AND s.password = :password")
    public Sluzbenik login(
            @Param("username") String username, 
            @Param("password") String password);
}
