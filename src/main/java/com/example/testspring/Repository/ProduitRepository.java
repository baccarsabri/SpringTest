package com.example.testspring.Repository;

import com.example.testspring.Entity.Categorie;
import com.example.testspring.Entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
}
