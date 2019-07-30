/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fon.silab.njt.diplomski.service.impl;

import fon.silab.njt.diplomski.domain.Grad;
import fon.silab.njt.diplomski.repository.GradRepository;
import fon.silab.njt.diplomski.service.GradService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Olja
 */
@Service
public class GradServiceImpl implements GradService {

    @Autowired
    private GradRepository gradRepository;

    @Override
    public List<Grad> getAll() {
        return gradRepository.findAll();
    }

    @Override
    public Grad getOne(Long id) {
        Optional<Grad> grad = gradRepository.findById(id);
        if (grad.isPresent()) {
            return grad.get();
        }
        return null;
    }

}
