package org.acme.schooltimetabling.domain;

import org.optaplanner.core.api.domain.lookup.PlanningId;
import org.springframework.data.repository.NoRepositoryBean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;

@Entity
@NoRepositoryBean
@Inheritance
public abstract class Base {

    @PlanningId
    @Id
    @GeneratedValue
    protected Long id;
    protected String name;

    protected Base() {}

    protected Base(String name) {
        this.name = name;
    }

    protected Base(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // ************************************************************************
    // Getters and setters
    // ************************************************************************

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public abstract String toString();

}
