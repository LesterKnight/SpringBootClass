package com.miranda.domain;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "DEPARTAMENTOS")
public class Departamento extends AbstractEntity<Long>{
    @Column(name = "nome", nullable = false, unique = true, length = 60)
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Cargo> getCargos() {
        return cargos;
    }

    public void setCargos(List<Cargo> cargos) {
        this.cargos = cargos;
    }

    @OneToMany(mappedBy = "departamento")
    private List<Cargo> cargos;
}
