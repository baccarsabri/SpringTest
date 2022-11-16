package com.example.testspring.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DetailFournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdDetailFournisseur ;
    private Date dateDebutCollaboration;
    private String adresse;
    private String matricule;
    @ManyToOne
    private Facture facture;
    @OneToOne
    private Fournisseur fournisseur;


}
