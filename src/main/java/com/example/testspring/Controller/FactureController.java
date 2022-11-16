package com.example.testspring.Controller;

import com.example.testspring.Entity.Facture;
import com.example.testspring.Service.FactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("facture")
public class FactureController {
    @Autowired
    FactureService factureService;
    @Autowired


    @GetMapping
    public List<Facture> displayFactures (){
        return factureService.getAllFactures() ;
    }
    @PostMapping
    public Facture addFacture (@RequestBody Facture F){

        return factureService.addFacture(F);

    }

    @PutMapping("{id}")
    public Facture update (@PathVariable("id")Long id ,@RequestBody Facture facture){
        return factureService.updateFacture(id,facture) ;

    }
    @DeleteMapping("{id}")
    public String delete(@PathVariable("id")Long id){
        return factureService.deleteFacture(factureService.getById(id));
    }
    @GetMapping("{id}")
    public Facture getFactureById(@PathVariable("id")Long id){
        return factureService.getById(id) ;
    }

    @PostMapping("/assign/{idF}/{idFr}")
    public Facture  assign(@PathVariable("idF") Long idF,@PathVariable("idFr")Long idFr){
    return factureService.assignFournisseurToFacture(idF,idFr);
    }
    @GetMapping("FalseArchive")
    public List<Facture> falseArchive (){
        return factureService.getAllFactureArchiveFalse() ;
    }



}
