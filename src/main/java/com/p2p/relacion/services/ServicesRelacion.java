package com.p2p.relacion.services;

import com.p2p.relacion.dao.RepositoryRelacion;
import com.p2p.relacion.entities.EntitiRelacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;

@Service
public class ServicesRelacion {
    @Autowired
    RepositoryRelacion repositoryRelacion;
    public void save(EntitiRelacion entitiRelacion){
    	repositoryRelacion.save(entitiRelacion);
    }
    
    public List<EntitiRelacion> getAll(){
        return repositoryRelacion.findAll();
    }

    public List<EntitiRelacion> getAllEstado(Long estado) {
        //https://www.baeldung.com/spring-data-query-by-example
        EntitiRelacion enm = new EntitiRelacion();
        enm.setEstado(estado);
        ExampleMatcher customExampleMatcher = ExampleMatcher.matchingAny()
                .withMatcher("estado", ExampleMatcher.GenericPropertyMatchers.contains().ignoreCase());
        Example<EntitiRelacion> example = Example.of(enm, customExampleMatcher);
        List<EntitiRelacion> passengers = repositoryRelacion.findAll(example);

        return passengers;//To change body of generated methods, choose Tools | Templates.
    }
}
