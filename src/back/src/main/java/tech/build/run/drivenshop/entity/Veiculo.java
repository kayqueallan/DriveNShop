package tech.build.run.drivenshop.entity;

import java.time.Instant;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.*;

@Entity
@Table(name = "veiculos")
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "ano")
    private int ano;

    @Column(name = "categoria")
    private int categoria;

    @Column(name = "condicao")
    private int condicao;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "localizacao")
    private int localizacao;

    @Column(name = "marca")
    private int marca;

    @Column(name = "modelo")
    private int modelo;

    @Column(name = "preco")
    private int preco;

    @Column(name = "quilometragem")
    private int quilometragem;

    @Column(name = "tipo")
    private int tipo;

    @Column(name = "status")
    private Integer status;

    @Column(name = "id_usuario")
    private String id_usuario;

    @CreationTimestamp
    private Instant creationTimestamp;

    @UpdateTimestamp
    private Instant updateTimestamp;

    public Veiculo() {
    }

    public Veiculo(UUID id, int ano, int categoria, int condicao, String descricao, int localizacao, int marca, int modelo, int preco, int quilometragem, int tipo, Integer status, String id_usuario, Instant creationTimestamp, Instant updateTimestamp) {
        this.id = id;
        this.ano = ano;
        this.categoria = categoria;
        this.condicao = condicao;
        this.descricao = descricao;
        this.localizacao = localizacao;
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.quilometragem = quilometragem;
        this.tipo = tipo;
        this.status = status;
        this.id_usuario = id_usuario;
        this.creationTimestamp = creationTimestamp;
        this.updateTimestamp = updateTimestamp;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getCondicao() {
        return condicao;
    }

    public void setCondicao(int condicao) {
        this.condicao = condicao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(int localizacao) {
        this.localizacao = localizacao;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Instant getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(Instant creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public Instant getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(Instant updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    } 
    
}
