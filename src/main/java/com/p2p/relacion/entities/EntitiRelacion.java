package com.p2p.relacion.entities;
 
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.p2p.empresa.dto.Empresa;

import java.io.Serializable;
import java.security.Timestamp; 

@Entity
@Table(
		name = "relacion", 
		schema = "public")
public class EntitiRelacion implements Serializable {
	
    /**
	 * Esta entidad de la relación comercial entre empresas
	 * Cuenta con un constraint que impedirá que se generen relaciones repetidas
	 * @author Carlos Mina
	 * @since 2019-NOV-10
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;   
    private Long idEmpresaEmisora; 
    private Long idEmpresaReceptora;
    private Long estado;
    private Timestamp created_at;
    private String created_by;
    private Timestamp updated_at;
    private String updated_by;
    
    
	public EntitiRelacion() { 
	} 
     

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}
  


	public Long getEstado() {
		return estado;
	}



	public void setEstado(Long estado) {
		this.estado = estado;
	}



	public Timestamp getCreated_at() {
		return created_at;
	}



	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}



	public String getCreated_by() {
		return created_by;
	}



	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}



	public Timestamp getUpdated_at() {
		return updated_at;
	}



	public void setUpdated_at(Timestamp updated_at) {
		this.updated_at = updated_at;
	}



	public String getUpdated_by() {
		return updated_by;
	}



	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
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

 
	
  
}
