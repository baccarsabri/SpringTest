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
public class Reglement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdReglement ;
    private Float montantPaye;
    private Float montantRestant;
    private Boolean payer;
    private Date dateReglement;
    @ManyToOne
    private Facture facture;
}
