/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fon.silab.njt.diplomski.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 *
 * @author Olja
 */
@Configuration
@Import(value = JPAConfig.class)
@ComponentScan(basePackages = {
    "fon.silab.njt.diplomski.service"
})
public class ApplicationConfig {
    
}
