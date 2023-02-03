package com.esprit.alternances.kaddem.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class DetailEquipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDetail", nullable = false)
    private long idDetail;

    private Integer salle;
    private String thematique;

}
