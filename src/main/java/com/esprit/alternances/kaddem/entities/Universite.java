package com.esprit.alternances.kaddem.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Universite  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idUniv", nullable = false)
    private long idUniv;


    private String nomUniversite;
    @OneToMany( mappedBy = "university",cascade = CascadeType.ALL)
    private List<Departement> departements;

}


