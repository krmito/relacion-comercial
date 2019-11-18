package com.p2p.relacion.api;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DozierMappingRelacion {
    @Bean
    public Mapper mapper() {
        return new DozerBeanMapper();
    }
}
