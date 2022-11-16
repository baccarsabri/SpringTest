package com.example.testspring.Entity;

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
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdProduit ;
    private String codeProduit;
    private String libelleProduit;
    private Float prix;
    private Date dateCreation;
    private Date dateDerniereModification;
    @OneToMany(mappedBy = "produit")
    private List<DetailFacture> detailFactures;
    @ManyToOne
    private Stock stock;
    @ManyToOne
    private Categorie categorie;
}
