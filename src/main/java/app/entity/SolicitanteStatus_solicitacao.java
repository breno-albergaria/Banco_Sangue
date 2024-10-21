
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;



import cronapp.framework.core.persistence.*;

/**
* Classe que representa a tabela SOLICITANTESTATUS_SOLICITACAO
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"SOLICITANTESTATUS_SOLICITACAO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.SolicitanteStatus_solicitacao")
@CronappTable(role=CronappTableRole.ASSOCIATION_CLASS)
public class SolicitanteStatus_solicitacao implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="STRING", label="Id")
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_solicitante", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Solicitante solicitante;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_status_solicitacao", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Status_solicitacao status_solicitacao;


    /**
    * Construtor
    * @generated
    */
    public SolicitanteStatus_solicitacao(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public SolicitanteStatus_solicitacao setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém solicitante
    * return solicitante
    * @generated
    */
    public Solicitante getSolicitante() {
        return this.solicitante;
    }

    /**
    * Define solicitante
    * @param solicitante solicitante
    * @generated
    */
    public SolicitanteStatus_solicitacao setSolicitante(Solicitante solicitante) {
        this.solicitante = solicitante;
        return this;
    }
    /**
    * Obtém status_solicitacao
    * return status_solicitacao
    * @generated
    */
    public Status_solicitacao getStatus_solicitacao() {
        return this.status_solicitacao;
    }

    /**
    * Define status_solicitacao
    * @param status_solicitacao status_solicitacao
    * @generated
    */
    public SolicitanteStatus_solicitacao setStatus_solicitacao(Status_solicitacao status_solicitacao) {
        this.status_solicitacao = status_solicitacao;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
SolicitanteStatus_solicitacao object = (SolicitanteStatus_solicitacao)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}