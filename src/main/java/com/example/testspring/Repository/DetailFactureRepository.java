package com.example.testspring.Repository;

import com.example.testspring.Entity.Categorie;
import com.example.testspring.Entity.DetailFacture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailFactureRepository extends JpaRepository<DetailFacture,Long> {
}
