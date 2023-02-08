package com.esprit.alternances.kaddem.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
public class Equipe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idEquipe", nullable = false)
    private long idEquipe;

    @Enumerated(EnumType.STRING)
    private  Niveau niveau;

    private String nomEquipe;

    @OneToOne
    private DetailEquipe detailEquipe;
    @ManyToMany
    private Set<Etudiant> etudiants;



}
