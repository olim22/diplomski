/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fon.silab.njt.diplomski.service.impl;

import fon.silab.njt.diplomski.domain.Dobavljac;
import fon.silab.njt.diplomski.repository.DobavljacRepository;
import fon.silab.njt.diplomski.service.DobavljacService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Olja
 */
@Service
public class DobavljacServiceImpl implements DobavljacService {

    @Autowired
    private DobavljacRepository dobavljacRepository;

    @Override
    public List<Dobavljac> getAll() {
        return dobavljacRepository.findAll();
    }

}
