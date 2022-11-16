package com.example.testspring.Repository;

import com.example.testspring.Entity.Categorie;
import com.example.testspring.Entity.DetailFournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailFournisseurRepository extends JpaRepository<DetailFournisseur,Long> {
}
