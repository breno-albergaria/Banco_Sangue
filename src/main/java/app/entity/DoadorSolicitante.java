
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
* Classe que representa a tabela DOADORSOLICITANTE
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"DOADORSOLICITANTE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.DoadorSolicitante")
@CronappTable(role=CronappTableRole.ASSOCIATION_CLASS)
public class DoadorSolicitante implements Serializable {
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
    @JoinColumn(name="fk_doador", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Doador doador;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_solicitante", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Solicitante solicitante;


    /**
    * Construtor
    * @generated
    */
    public DoadorSolicitante(){
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
    public DoadorSolicitante setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém doador
    * return doador
    * @generated
    */
    public Doador getDoador() {
        return this.doador;
    }

    /**
    * Define doador
    * @param doador doador
    * @generated
    */
    public DoadorSolicitante setDoador(Doador doador) {
        this.doador = doador;
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
    public DoadorSolicitante setSolicitante(Solicitante solicitante) {
        this.solicitante = solicitante;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
DoadorSolicitante object = (DoadorSolicitante)obj;
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