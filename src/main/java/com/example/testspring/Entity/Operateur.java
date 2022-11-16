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
public class Operateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdOperateur ;
    private String nom;
    private String prenom;
    private String password;
    @OneToMany
    private List<Facture> Factures ;

}
