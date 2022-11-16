package com.example.testspring.Service;

import com.example.testspring.Entity.Facture;
import com.example.testspring.Entity.Fournisseur;
import com.example.testspring.Repository.FactureRepository;
import com.example.testspring.Repository.FournisseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FactureServicec implements FactureService{
@Autowired
    FactureRepository factureRepository;
@Autowired
    FournisseurRepository fournisseurRepository;
    @Override
    public Facture addFacture(Facture f) {
        return factureRepository.save(f);
    }



    @Override
    public Facture updateFacture(Long id,Facture facture) {
        Facture f1 = factureRepository.findById(id).orElse(null);
        if (f1!=null){
            ////   etudiant1.setEquipes(etudiant.getEquipes());
            f1.setMontantFacture(facture.getMontantFacture());
            f1.setMontantRemise(facture.getMontantRemise());
            f1.setDateCreationFacture(facture.getDateCreationFacture());
            f1.setDateDerniereModification(facture.getDateDerniereModification());
            f1.setArchive(facture.getArchive());
            f1.setFournisseur(facture.getFournisseur());
            f1.setReglements(facture.getReglements());
            f1.setDetailFactures(facture.getDetailFactures());


            return factureRepository.save(f1);
        }
        else return null;
    }



    @Override
    public String deleteFacture(Facture facture) {
        if(facture != null){
            factureRepository.delete(facture);
            return "facture supprimé";
        }
        return "facture non existant";

    }

    @Override
    public List<Facture> getAllFactures() {
        return factureRepository.findAll();
    }

    @Override
    public Facture getById(Long id) {
        return factureRepository.findById(id).orElse(null);

    }
    @Override
    public Facture assignFournisseurToFacture (Long idFacture, Long
            IdFournisseur){
        Facture f=factureRepository.findById(idFacture).orElse(null);
        Fournisseur fr=fournisseurRepository.findById(IdFournisseur).orElse(null);
        if(f !=null && fr!=null){
         f.setFournisseur(fr);
         return factureRepository.save(f);
        }else
            return null;
    }
    @Override
    public List<Facture> getAllFactureArchiveFalse(){
        return factureRepository.findFactureByArchiveIsFalse();
    }



}
