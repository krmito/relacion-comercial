package com.p2p.relacion.dto;

import java.util.Objects; 

/** Datos de la relación comercial */

public class Relacion {
    private Long id;
    private Long idEmpresaEmisora;
    private Long idEmpresaReceptora; 
    private Long estado;


	public Relacion() { 
    }
  
    
    public Relacion(Long id, Long idEmpresaEmisora, Long idEmpresaReceptora, Long estado) {
		super();
		this.id = id;
		this.idEmpresaEmisora = idEmpresaEmisora;
		this.idEmpresaReceptora = idEmpresaReceptora; 
		this.estado = estado;
	}

 

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Long getIdEmpresaEmisora() {
		return idEmpresaEmisora;
	}



	public void setIdEmpresaEmisora(Long idEmpresaEmisora) {
		this.idEmpresaEmisora = idEmpresaEmisora;
	}



	public Long getIdEmpresaReceptora() {
		return idEmpresaReceptora;
	}



	public void setIdEmpresaReceptora(Long idEmpresaReceptora) {
		this.idEmpresaReceptora = idEmpresaReceptora;
	}


	public Long getEstado() {
		return estado;
	}


	public void setEstado(Long estado) {
		this.estado = estado;
	}
 
    
    

}
