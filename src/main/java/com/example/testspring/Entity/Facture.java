package com.example.testspring.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdFacture ;
    private Float montantRemise;
    private Float montantFacture;
    private Date dateCreationFacture;
    private Date dateDerniereModification;
    private Boolean archive;
    @OneToMany(mappedBy = "facture")
    @JsonIgnore
    private List<Reglement> reglements ;
    @ManyToOne
    private Fournisseur fournisseur;
    @OneToMany(mappedBy = "facture")
    private List<DetailFacture> detailFactures ;



}
