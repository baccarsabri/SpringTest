package com.example.testspring.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdFournisseur ;
    private String codeFournisseur;
    private String libelleFournisseur;
    @Enumerated(EnumType.STRING)
    private CategorieFournisseur categorieFournisseur;
    @OneToMany(mappedBy = "fournisseur")
    @JsonIgnore
    private List<Facture> factures ;
    @ManyToMany
    private List<SecteurActivite> secteurActivites;
    @OneToOne(mappedBy = "fournisseur")
    private DetailFournisseur detailFournisseur;
}
