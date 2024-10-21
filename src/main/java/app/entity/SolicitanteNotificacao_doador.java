
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
* Classe que representa a tabela SOLICITANTENOTIFICACAO_DOADOR
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"SOLICITANTENOTIFICACAO_DOADOR\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.SolicitanteNotificacao_doador")
@CronappTable(role=CronappTableRole.ASSOCIATION_CLASS)
public class SolicitanteNotificacao_doador implements Serializable {
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
    @JoinColumn(name="fk_notificacao_doador", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Notificacao_doador notificacao_doador;


    /**
    * Construtor
    * @generated
    */
    public SolicitanteNotificacao_doador(){
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
    public SolicitanteNotificacao_doador setId(java.lang.String id) {
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
    public SolicitanteNotificacao_doador setSolicitante(Solicitante solicitante) {
        this.solicitante = solicitante;
        return this;
    }
    /**
    * Obtém notificacao_doador
    * return notificacao_doador
    * @generated
    */
    public Notificacao_doador getNotificacao_doador() {
        return this.notificacao_doador;
    }

    /**
    * Define notificacao_doador
    * @param notificacao_doador notificacao_doador
    * @generated
    */
    public SolicitanteNotificacao_doador setNotificacao_doador(Notificacao_doador notificacao_doador) {
        this.notificacao_doador = notificacao_doador;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
SolicitanteNotificacao_doador object = (SolicitanteNotificacao_doador)obj;
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