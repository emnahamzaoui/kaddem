package com.esprit.alternances.kaddem.entities;



import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
    @Table( name = "Etudiant")
    public class Etudiant implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="idEtudiant")
        private Integer idEtudiant; // Clé primaire
        private String prenomE;
        private String nomE;
        @Enumerated(EnumType.STRING)
        private Option op;

        @ManyToMany(mappedBy="etudiants")
         private List<Equipe> equipe;

        @ManyToOne
         private Departement departement;

       @OneToMany(mappedBy="etudiant")
         private List<Contrat> contrats;


      // Constructeur et accesseurs (getters) et mutateurs (setters)
    }


