package com.p2p.relacion.dao;

import org.springframework.data.jpa.repository.JpaRepository; 
import com.p2p.relacion.entities.EntitiRelacion;

public interface RepositoryRelacion extends JpaRepository<EntitiRelacion,String> {
}
