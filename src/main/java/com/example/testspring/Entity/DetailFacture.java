package com.example.testspring.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DetailFacture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdDetailFacture ;
    private int qteCommande;
    private Float prixTotalDetails;
    private int pourcentageRemise;
    private Float montantRemise;
    @ManyToOne
    private Facture facture;
    @ManyToOne
    private Produit produit;
}
