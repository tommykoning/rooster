package org.acme.schooltimetabling.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.optaplanner.core.api.domain.lookup.PlanningId;
@Entity
public class Teacher  extends Base{

    private String subject;

    public Teacher() {}
    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public Teacher(long id, String name, String subjects) {
        this(name, subjects);
        this.id = id;
    }

    @Override
    public String toString() {
        return name + "(" + id + ")";
    }

    public String getSubject() {
        return subject;
    }
}
