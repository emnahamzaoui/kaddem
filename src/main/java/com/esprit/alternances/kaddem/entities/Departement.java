package com.esprit.alternances.kaddem.entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDepart", nullable = false)
    private long idDepart;


    private String nomDepartment;


}
