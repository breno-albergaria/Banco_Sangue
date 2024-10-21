
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
* Classe que representa a tabela NOTIFICACAO_DOADOR
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"NOTIFICACAO_DOADOR\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Notificacao_doador")
@CronappTable(role=CronappTableRole.CLASS)
public class Notificacao_doador implements Serializable {
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
    @Temporal(TemporalType.DATE)
    @CronappColumn(attributeType="DATE", label="Data Envio")
    @Column(name = "data_envio", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date data_envio;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Confirmar Doacao")
    @Column(name = "confirmar_doacao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String confirmar_doacao;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Envio Email Doacao")
    @Column(name = "envio_email_doacao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String envio_email_doacao;


    /**
    * Construtor
    * @generated
    */
    public Notificacao_doador(){
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
    public Notificacao_doador setId(java.lang.Integer id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém data_envio
    * return data_envio
    * @generated
    */
    public java.util.Date getData_envio() {
        return this.data_envio;
    }

    /**
    * Define data_envio
    * @param data_envio data_envio
    * @generated
    */
    public Notificacao_doador setData_envio(java.util.Date data_envio) {
        this.data_envio = data_envio;
        return this;
    }
    /**
    * Obtém confirmar_doacao
    * return confirmar_doacao
    * @generated
    */
    public java.lang.String getConfirmar_doacao() {
        return this.confirmar_doacao;
    }

    /**
    * Define confirmar_doacao
    * @param confirmar_doacao confirmar_doacao
    * @generated
    */
    public Notificacao_doador setConfirmar_doacao(java.lang.String confirmar_doacao) {
        this.confirmar_doacao = confirmar_doacao;
        return this;
    }
    /**
    * Obtém envio_email_doacao
    * return envio_email_doacao
    * @generated
    */
    public java.lang.String getEnvio_email_doacao() {
        return this.envio_email_doacao;
    }

    /**
    * Define envio_email_doacao
    * @param envio_email_doacao envio_email_doacao
    * @generated
    */
    public Notificacao_doador setEnvio_email_doacao(java.lang.String envio_email_doacao) {
        this.envio_email_doacao = envio_email_doacao;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Notificacao_doador object = (Notificacao_doador)obj;
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