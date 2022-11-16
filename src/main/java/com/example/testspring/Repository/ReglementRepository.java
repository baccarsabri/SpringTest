package com.example.testspring.Repository;

import com.example.testspring.Entity.Categorie;
import com.example.testspring.Entity.Reglement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReglementRepository extends JpaRepository<Reglement,Long> {
}
