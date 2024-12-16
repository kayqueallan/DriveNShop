package tech.build.run.drivenshop.entity;

import java.time.Instant;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.*;

@Entity
@Table(name = "propostas")
public class Proposta {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "permuta")
    private String permuta;

    @Column(name = "valor")
    private int valor;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "id_veiculo")
    private String id_veiculo;

    @Column(name = "id_usuario")
    private String id_usuario;

    @CreationTimestamp
    private Instant creationTimestamp;

    @UpdateTimestamp
    private Instant updateTimestamp;

    public Proposta() {
    }

    public Proposta(UUID id, String permuta, int valor, String telefone, String id_veiculo, String id_usuario, Instant creationTimestamp, Instant updateTimestamp) {
        this.id = id;
        this.permuta = permuta;
        this.valor = valor;
        this.telefone = telefone;
        this.id_veiculo = id_veiculo;
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

    public String getPermuta() {
        return permuta;
    }

    public void setPermuta(String permuta) {
        this.permuta = permuta;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getId_veiculo() {
        return id_veiculo;
    }

    public void setId_veiculo(String id_veiculo) {
        this.id_veiculo = id_veiculo;
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
