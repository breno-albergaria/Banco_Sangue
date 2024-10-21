
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
* Classe que representa a tabela TIPO_SANGUINEO
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"TIPO_SANGUINEO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Tipo_sanguineo")
@CronappTable(role=CronappTableRole.CLASS)
public class Tipo_sanguineo implements Serializable {
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
    @CronappColumn(attributeType="STRING", label="Tipo Sangue")
    @Column(name = "tipo_sangue", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String tipo_sangue;


    /**
    * Construtor
    * @generated
    */
    public Tipo_sanguineo(){
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
    public Tipo_sanguineo setId(java.lang.Integer id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém tipo_sangue
    * return tipo_sangue
    * @generated
    */
    public java.lang.String getTipo_sangue() {
        return this.tipo_sangue;
    }

    /**
    * Define tipo_sangue
    * @param tipo_sangue tipo_sangue
    * @generated
    */
    public Tipo_sanguineo setTipo_sangue(java.lang.String tipo_sangue) {
        this.tipo_sangue = tipo_sangue;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Tipo_sanguineo object = (Tipo_sanguineo)obj;
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