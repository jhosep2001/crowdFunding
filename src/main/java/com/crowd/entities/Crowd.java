package com.crowd.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "Crowd")
public class Crowd {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String name;

    @ManyToOne
    @JoinTable(name = "crowd_x_publisher")
    @NotNull
    private Publisher publisher;

    @ManyToMany
    @JoinTable(name = "crowd_x_founder")
    private List<Founder> founderList;

    @Column(name = "tiempoLimite")
    @Basic
    private Date sqlDate;

    @Column(name = "precio")
    private Long price;

    @Column(name = "tipo")
    private Long type;

    public Crowd() {
    }

    public Crowd(String name, Publisher publisher, List<Founder> founderList, Date sqlDate, Long price) {
        this.name = name;
        this.publisher = publisher;
        this.founderList = founderList;
        this.sqlDate = sqlDate;
        this.price = price;
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

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public List<Founder> getFounderList() {
        return founderList;
    }

    public void setFounderList(List<Founder> founderList) {
        this.founderList = founderList;
    }

    public Date getSqlDate() {
        return sqlDate;
    }

    public void setSqlDate(Date sqlDate) {
        this.sqlDate = sqlDate;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }
}
