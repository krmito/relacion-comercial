package com.p2p.relacion.api;

import com.p2p.relacion.dto.Relacion;
import com.p2p.relacion.entities.EntitiRelacion;
import com.p2p.relacion.services.ServicesRelacion;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class ApiRelacion {
    @Autowired
    ServicesRelacion servicesRelacion;
    @Autowired
    Mapper mapper; //Objeto para mapear Empresa a EntitiEmpresa y realizar la persistencia

    
    /**
     * Método que retornará todas las empresas
     * @return listado de empresas
     */
    @RequestMapping(value = "/relacion", method = RequestMethod.GET)
    public List<Relacion> getEmpresa(){
        List<EntitiRelacion> all =  servicesRelacion.getAll();
        List<Relacion> list = new ArrayList<>();
        for (EntitiRelacion dto: all){
            Relacion map = mapper.map(dto,Relacion.class);
            list.add(map);
        }
        return list;
    }
    
    @RequestMapping(value = "/relacion/{estado}", method = RequestMethod.GET)
    public List<Relacion> getMenuRoll(@PathVariable("estado") Long estado){
        List<EntitiRelacion> all =  servicesRelacion.getAllEstado(estado);
        List<Relacion> list = new LinkedList<>();
        for (EntitiRelacion dto:all){
            Relacion map = mapper.map(dto,Relacion.class);
            list.add(map);
        }
        return list;
    }

    @RequestMapping(value = "/relacion", method = RequestMethod.POST)
    public void saveEmpresa(@RequestBody Relacion empresa){
        EntitiRelacion entitiEmpresa =mapper.map(empresa,EntitiRelacion.class);
        servicesRelacion.save(entitiEmpresa);
    }
    
    @RequestMapping(value = "/relacion/{id}", method = RequestMethod.PUT)
    public void updateEmpresa(@RequestBody Relacion empresa){
        EntitiRelacion entitiEmpresa =mapper.map(empresa,EntitiRelacion.class);
        servicesRelacion.save(entitiEmpresa);
    }
    
}
