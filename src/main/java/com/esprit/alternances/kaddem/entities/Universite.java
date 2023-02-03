package com.esprit.alternances.kaddem.entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Universite  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idUniv", nullable = false)
    private long idUniv;


    private String nomUniversite;

}


