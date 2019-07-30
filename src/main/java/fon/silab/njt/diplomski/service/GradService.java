/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fon.silab.njt.diplomski.service;

import fon.silab.njt.diplomski.domain.Grad;
import java.util.List;

/**
 *
 * @author Olja
 */
public interface GradService {

    List<Grad> getAll();

    Grad getOne(Long id);
}
