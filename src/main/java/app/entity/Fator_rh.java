
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
* Classe que representa a tabela FATOR_RH
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"FATOR_RH\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Fator_rh")
@CronappTable(role=CronappTableRole.CLASS)
public class Fator_rh implements Serializable {
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
    @CronappColumn(attributeType="STRING", label="Fator Rh")
    @Column(name = "fator_rh", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String fator_rh;


    /**
    * Construtor
    * @generated
    */
    public Fator_rh(){
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
    public Fator_rh setId(java.lang.Integer id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém fator_rh
    * return fator_rh
    * @generated
    */
    public java.lang.String getFator_rh() {
        return this.fator_rh;
    }

    /**
    * Define fator_rh
    * @param fator_rh fator_rh
    * @generated
    */
    public Fator_rh setFator_rh(java.lang.String fator_rh) {
        this.fator_rh = fator_rh;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Fator_rh object = (Fator_rh)obj;
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