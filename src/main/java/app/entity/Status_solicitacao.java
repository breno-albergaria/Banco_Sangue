
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
* Classe que representa a tabela STATUS_SOLICITACAO
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"STATUS_SOLICITACAO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Status_solicitacao")
@CronappTable(role=CronappTableRole.CLASS)
public class Status_solicitacao implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @CronappColumn(attributeType="INTEGER", label="Id")
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer id;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Status Solicitacao")
    @Column(name = "status_solicitacao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String status_solicitacao;


    /**
    * Construtor
    * @generated
    */
    public Status_solicitacao(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.Integer getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Status_solicitacao setId(java.lang.Integer id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém status_solicitacao
    * return status_solicitacao
    * @generated
    */
    public java.lang.String getStatus_solicitacao() {
        return this.status_solicitacao;
    }

    /**
    * Define status_solicitacao
    * @param status_solicitacao status_solicitacao
    * @generated
    */
    public Status_solicitacao setStatus_solicitacao(java.lang.String status_solicitacao) {
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
Status_solicitacao object = (Status_solicitacao)obj;
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