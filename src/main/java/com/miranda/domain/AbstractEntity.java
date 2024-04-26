package com.miranda.domain;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.*;
@MappedSuperclass
public class AbstractEntity <ID extends Serializable>implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ID id;

    public void setId(ID id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "id = "+id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractEntity<?> that = (AbstractEntity<?>) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public ID getId() {
        return id;
    }
}
