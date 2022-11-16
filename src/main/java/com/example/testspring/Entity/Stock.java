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
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdStock ;
    private int qte;
    private int qteMin;
    private String libelleStock;
    @OneToMany(mappedBy = "stock")
    private List<Produit> produits;
}
