
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
* Classe que representa a tabela SOLICITANTE
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"SOLICITANTE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Solicitante")
@CronappTable(role=CronappTableRole.CLASS)
public class Solicitante implements Serializable {
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
    @CronappColumn(attributeType="STRING", label="Nome Paciente")
    @Column(name = "nome_paciente", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome_paciente;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Local Doacao")
    @Column(name = "local_doacao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String local_doacao;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Telefone Local Doacao", mask="(00) 00000-0000;0")
    @Column(name = "telefone_local_doacao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String telefone_local_doacao;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="Quantidade Doadores")
    @Column(name = "quantidade_doadores", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer quantidade_doadores;


    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @CronappColumn(attributeType="DATE", label="Data Limite")
    @Column(name = "data_limite", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date data_limite;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Informacoes")
    @Column(name = "informacoes", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String informacoes;


    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @CronappColumn(attributeType="DATE", label="Data Solicitacao")
    @Column(name = "data_solicitacao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date data_solicitacao;


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
    public Solicitante(){
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
    public Solicitante setId(java.lang.Integer id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém nome_paciente
    * return nome_paciente
    * @generated
    */
    public java.lang.String getNome_paciente() {
        return this.nome_paciente;
    }

    /**
    * Define nome_paciente
    * @param nome_paciente nome_paciente
    * @generated
    */
    public Solicitante setNome_paciente(java.lang.String nome_paciente) {
        this.nome_paciente = nome_paciente;
        return this;
    }
    /**
    * Obtém local_doacao
    * return local_doacao
    * @generated
    */
    public java.lang.String getLocal_doacao() {
        return this.local_doacao;
    }

    /**
    * Define local_doacao
    * @param local_doacao local_doacao
    * @generated
    */
    public Solicitante setLocal_doacao(java.lang.String local_doacao) {
        this.local_doacao = local_doacao;
        return this;
    }
    /**
    * Obtém telefone_local_doacao
    * return telefone_local_doacao
    * @generated
    */
    public java.lang.String getTelefone_local_doacao() {
        return this.telefone_local_doacao;
    }

    /**
    * Define telefone_local_doacao
    * @param telefone_local_doacao telefone_local_doacao
    * @generated
    */
    public Solicitante setTelefone_local_doacao(java.lang.String telefone_local_doacao) {
        this.telefone_local_doacao = telefone_local_doacao;
        return this;
    }
    /**
    * Obtém quantidade_doadores
    * return quantidade_doadores
    * @generated
    */
    public java.lang.Integer getQuantidade_doadores() {
        return this.quantidade_doadores;
    }

    /**
    * Define quantidade_doadores
    * @param quantidade_doadores quantidade_doadores
    * @generated
    */
    public Solicitante setQuantidade_doadores(java.lang.Integer quantidade_doadores) {
        this.quantidade_doadores = quantidade_doadores;
        return this;
    }
    /**
    * Obtém data_limite
    * return data_limite
    * @generated
    */
    public java.util.Date getData_limite() {
        return this.data_limite;
    }

    /**
    * Define data_limite
    * @param data_limite data_limite
    * @generated
    */
    public Solicitante setData_limite(java.util.Date data_limite) {
        this.data_limite = data_limite;
        return this;
    }
    /**
    * Obtém informacoes
    * return informacoes
    * @generated
    */
    public java.lang.String getInformacoes() {
        return this.informacoes;
    }

    /**
    * Define informacoes
    * @param informacoes informacoes
    * @generated
    */
    public Solicitante setInformacoes(java.lang.String informacoes) {
        this.informacoes = informacoes;
        return this;
    }
    /**
    * Obtém data_solicitacao
    * return data_solicitacao
    * @generated
    */
    public java.util.Date getData_solicitacao() {
        return this.data_solicitacao;
    }

    /**
    * Define data_solicitacao
    * @param data_solicitacao data_solicitacao
    * @generated
    */
    public Solicitante setData_solicitacao(java.util.Date data_solicitacao) {
        this.data_solicitacao = data_solicitacao;
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
    public Solicitante setFator_rh(Fator_rh fator_rh) {
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
    public Solicitante setTipo_sanguineo(Tipo_sanguineo tipo_sanguineo) {
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
Solicitante object = (Solicitante)obj;
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