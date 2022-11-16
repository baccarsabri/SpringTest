package com.example.testspring.Service;

import com.example.testspring.Entity.Facture;

import java.util.List;

public interface FactureService {
    public Facture addFacture(Facture facture) ;

    public Facture updateFacture(Long id,Facture facture);

    public String deleteFacture(Facture f) ;
    public List<Facture> getAllFactures();

    public Facture getById (Long id) ;

    public Facture assignFournisseurToFacture (Long idFacture, Long
            IdFournisseur);

    public List<Facture> getAllFactureArchiveFalse();
}
