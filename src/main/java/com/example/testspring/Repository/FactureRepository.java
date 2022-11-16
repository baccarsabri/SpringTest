package com.example.testspring.Repository;

import com.example.testspring.Entity.Categorie;
import com.example.testspring.Entity.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FactureRepository extends JpaRepository<Facture,Long> {
    public List<Facture> findFactureByArchiveIsFalse();
}
