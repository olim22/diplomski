/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fon.silab.njt.diplomski.service.impl;

import fon.silab.njt.diplomski.domain.Sluzbenik;
import fon.silab.njt.diplomski.repository.SluzbenikRepository;
import fon.silab.njt.diplomski.service.SluzbenikService;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Olja
 */
@Service
@Transactional
public class SluzbenikServiceImpl implements SluzbenikService {

    @Autowired
    private SluzbenikRepository sluzbenikRepository;

    @Override
    public Sluzbenik login(String username, String password) {
        return sluzbenikRepository.login(username, password);
    }

}
