package com.crowd.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "Publisher")
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String name;

    @Column(name= "apellido")
    private String lastName;

    @OneToMany
    @JoinTable(name = "crowd_x_publisher")
    private List<Crowd> crowdList;

    @Column(name = "eliminado")
    private Boolean isDeleted;

    public Publisher() {
    }

    public Publisher(String name, String lastName, List<Crowd> crowdList) {
        this.name = name;
        this.lastName = lastName;
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

    public List<Crowd> getCrowdList() {
        return crowdList;
    }

    public void setCrowdList(List<Crowd> crowdList) {
        this.crowdList = crowdList;
    }
}
