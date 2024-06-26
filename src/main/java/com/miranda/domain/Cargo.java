package com.miranda.domain;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "CARGOS")
public class Cargo extends AbstractEntity<Long>{
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @OneToMany(mappedBy = "cargo")
    private List<Funcionario> funcionarios;
    @Column(name = "nome", nullable = false, unique = true, length = 60)
    private String nome;
    @ManyToOne
    @JoinColumn(name = "id_departamento_fk")
    private Departamento departamento;
}
