package tech.build.run.drivenshop.entity;

import java.time.Instant;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.*;

@Entity
@Table(name = "feedback")
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "comentario")
    private String comentario;

    @Column(name = "tipo_transacao")
    private int tipo_transacao;

    @Column(name = "avaliacao")
    private int avaliacao;

    @Column(name = "id_avaliador")
    private String id_avaliador;

    @Column(name = "id_avaliado")
    private String id_avaliado;

    @CreationTimestamp
    private Instant creationTimestamp;

    @UpdateTimestamp
    private Instant updateTimestamp;

    public Feedback() {
    }

    public Feedback(UUID id, String comentario, int tipo_transacao, int avaliacao, String id_avaliador, String id_avaliado, Instant creationTimestamp, Instant updateTimestamp) {
        this.id = id;
        this.comentario = comentario;
        this.tipo_transacao = tipo_transacao;
        this.avaliacao = avaliacao;
        this.id_avaliador = id_avaliador;
        this.id_avaliado = id_avaliado;
        this.creationTimestamp = creationTimestamp;
        this.updateTimestamp = updateTimestamp;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getTipo_transacao() {
        return tipo_transacao;
    }

    public void setTipo_transacao(int tipo_transacao) {
        this.tipo_transacao = tipo_transacao;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getId_avaliador() {
        return id_avaliador;
    }

    public void setId_avaliador(String id_avaliador) {
        this.id_avaliador = id_avaliador;
    }

    public String getId_avaliado() {
        return id_avaliado;
    }

    public void setId_avaliado(String id_avaliado) {
        this.id_avaliado = id_avaliado;
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
