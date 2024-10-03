package br.com.fiap.sprint1.models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Calendar;

@Entity
@Table(name = "tb_dentista")
@SequenceGenerator(name = "dentista", sequenceName = "sq_tb_dentista", allocationSize = 1)
public class Dentista {

    @Id
    @Column(name = "id_dentista")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dentista")
    private int id;

    @Column(name = "nm_dentista", nullable = false, length = 50)
    private String nome;

    @Column(name = "nr_cro", nullable = false, length = 9)
    private String cro;

    @Column(name = "ds_email", nullable = false)
    private String email;

    @Column(name = "nr_tel", nullable = false)
    private int telefone;

    @Enumerated(EnumType.STRING)
    @Column(name = "ds_genero", length = 10)
    private Genero genero;

    @Enumerated(EnumType.STRING)
    @Column(name = "st_status", nullable = false, length = 10)
    private Status status;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dt_cadastro",updatable = false)
    private Calendar dataCadastro;

    @ManyToOne
    @JoinColumn(name = "id_clinica", nullable = false)
    private Clinica clinica;

    public Dentista() {}

    public Dentista(String nome, String cro, String email, int telefone, Genero genero, Status status, Clinica clinica) {
        this.nome = nome;
        this.cro = cro;
        this.email = email;
        this.telefone = telefone;
        this.genero = genero;
        this.status = status;
        this.clinica = clinica;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCro() {
        return cro;
    }

    public void setCro(String cro) {
        this.cro = cro;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Calendar getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Calendar dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Clinica getClinica() {
        return clinica;
    }

    public void setClinica(Clinica clinica) {
        this.clinica = clinica;
    }
}
