package com.example.testspring.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdCategorieProduit ;
    private String codeProduit;
    private String libelleCategorieProduit;
    @OneToMany(mappedBy = "categorie")
    private List<Produit> produits;
}
