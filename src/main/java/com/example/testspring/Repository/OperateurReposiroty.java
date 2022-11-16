package com.example.testspring.Repository;

import com.example.testspring.Entity.Categorie;
import com.example.testspring.Entity.Operateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperateurReposiroty extends JpaRepository<Operateur,Long> {
}
