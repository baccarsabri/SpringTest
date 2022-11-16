package com.example.testspring.Repository;

import com.example.testspring.Entity.Categorie;
import com.example.testspring.Entity.SecteurActivite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecteurActiviteRepository extends JpaRepository<SecteurActivite,Long> {
}
