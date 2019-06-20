package com.crowd.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Founder")
public class Founder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String name;

    @Column(name= "apellido")
    private String lastName;

    @Column(name = "identificacion")
    private Long identification;

    @Column(name = "eliminado")
    private Boolean isDeleted;

    @ManyToMany
    @JoinTable(name="crowd_x_publisher")
    private List<Crowd> crowdList;

    public Founder() {
    }

    public Founder(String name, String lastName, Long identification, Boolean isDeleted, List<Crowd> crowdList) {
        this.name = name;
        this.lastName = lastName;
        this.identification = identification;
        this.isDeleted = isDeleted;
        this.crowdList = crowdList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getIdentification() {
        return identification;
    }

    public void setIdentification(Long identification) {
        this.identification = identification;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public List<Crowd> getCrowdList() {
        return crowdList;
    }

    public void setCrowdList(List<Crowd> crowdList) {
        this.crowdList = crowdList;
    }
}
