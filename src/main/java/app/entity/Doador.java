
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
* Classe que representa a tabela DOADOR
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"DOADOR\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Doador")
@CronappTable(role=CronappTableRole.ASSOCIATION_CLASS)
public class Doador implements Serializable {
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
    @CronappColumn(attributeType="STRING", label="Nome Doador")
    @Column(name = "nome_doador", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome_doador;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Email Doador")
    @Column(name = "email_doador", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String email_doador;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Entidade")
    @Column(name = "entidade", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String entidade;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Unidade")
    @Column(name = "unidade", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String unidade;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Idade Doador")
    @Column(name = "idade_doador", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String idade_doador;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Sexo Doador")
    @Column(name = "sexo_doador", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String sexo_doador;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Carteira Doador")
    @Column(name = "carteira_doador", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String carteira_doador;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Telefone Doador", mask="(00) 00000-0000;0")
    @Column(name = "telefone_doador", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String telefone_doador;


    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @CronappColumn(attributeType="DATE", label="Data Cadastro")
    @Column(name = "data_cadastro", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date data_cadastro;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_fator_rh", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Fator_rh fator_rh;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_tipo_sanguineo", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Tipo_sanguineo tipo_sanguineo;


    /**
    * Construtor
    * @generated
    */
    public Doador(){
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
    public Doador setId(java.lang.Integer id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém nome_doador
    * return nome_doador
    * @generated
    */
    public java.lang.String getNome_doador() {
        return this.nome_doador;
    }

    /**
    * Define nome_doador
    * @param nome_doador nome_doador
    * @generated
    */
    public Doador setNome_doador(java.lang.String nome_doador) {
        this.nome_doador = nome_doador;
        return this;
    }
    /**
    * Obtém email_doador
    * return email_doador
    * @generated
    */
    public java.lang.String getEmail_doador() {
        return this.email_doador;
    }

    /**
    * Define email_doador
    * @param email_doador email_doador
    * @generated
    */
    public Doador setEmail_doador(java.lang.String email_doador) {
        this.email_doador = email_doador;
        return this;
    }
    /**
    * Obtém entidade
    * return entidade
    * @generated
    */
    public java.lang.String getEntidade() {
        return this.entidade;
    }

    /**
    * Define entidade
    * @param entidade entidade
    * @generated
    */
    public Doador setEntidade(java.lang.String entidade) {
        this.entidade = entidade;
        return this;
    }
    /**
    * Obtém unidade
    * return unidade
    * @generated
    */
    public java.lang.String getUnidade() {
        return this.unidade;
    }

    /**
    * Define unidade
    * @param unidade unidade
    * @generated
    */
    public Doador setUnidade(java.lang.String unidade) {
        this.unidade = unidade;
        return this;
    }
    /**
    * Obtém idade_doador
    * return idade_doador
    * @generated
    */
    public java.lang.String getIdade_doador() {
        return this.idade_doador;
    }

    /**
    * Define idade_doador
    * @param idade_doador idade_doador
    * @generated
    */
    public Doador setIdade_doador(java.lang.String idade_doador) {
        this.idade_doador = idade_doador;
        return this;
    }
    /**
    * Obtém sexo_doador
    * return sexo_doador
    * @generated
    */
    public java.lang.String getSexo_doador() {
        return this.sexo_doador;
    }

    /**
    * Define sexo_doador
    * @param sexo_doador sexo_doador
    * @generated
    */
    public Doador setSexo_doador(java.lang.String sexo_doador) {
        this.sexo_doador = sexo_doador;
        return this;
    }
    /**
    * Obtém carteira_doador
    * return carteira_doador
    * @generated
    */
    public java.lang.String getCarteira_doador() {
        return this.carteira_doador;
    }

    /**
    * Define carteira_doador
    * @param carteira_doador carteira_doador
    * @generated
    */
    public Doador setCarteira_doador(java.lang.String carteira_doador) {
        this.carteira_doador = carteira_doador;
        return this;
    }
    /**
    * Obtém telefone_doador
    * return telefone_doador
    * @generated
    */
    public java.lang.String getTelefone_doador() {
        return this.telefone_doador;
    }

    /**
    * Define telefone_doador
    * @param telefone_doador telefone_doador
    * @generated
    */
    public Doador setTelefone_doador(java.lang.String telefone_doador) {
        this.telefone_doador = telefone_doador;
        return this;
    }
    /**
    * Obtém data_cadastro
    * return data_cadastro
    * @generated
    */
    public java.util.Date getData_cadastro() {
        return this.data_cadastro;
    }

    /**
    * Define data_cadastro
    * @param data_cadastro data_cadastro
    * @generated
    */
    public Doador setData_cadastro(java.util.Date data_cadastro) {
        this.data_cadastro = data_cadastro;
        return this;
    }
    /**
    * Obtém fator_rh
    * return fator_rh
    * @generated
    */
    public Fator_rh getFator_rh() {
        return this.fator_rh;
    }

    /**
    * Define fator_rh
    * @param fator_rh fator_rh
    * @generated
    */
    public Doador setFator_rh(Fator_rh fator_rh) {
        this.fator_rh = fator_rh;
        return this;
    }
    /**
    * Obtém tipo_sanguineo
    * return tipo_sanguineo
    * @generated
    */
    public Tipo_sanguineo getTipo_sanguineo() {
        return this.tipo_sanguineo;
    }

    /**
    * Define tipo_sanguineo
    * @param tipo_sanguineo tipo_sanguineo
    * @generated
    */
    public Doador setTipo_sanguineo(Tipo_sanguineo tipo_sanguineo) {
        this.tipo_sanguineo = tipo_sanguineo;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Doador object = (Doador)obj;
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