package com.example.testspring.Repository;

import com.example.testspring.Entity.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieReposirory extends JpaRepository<Categorie,Long> {
}
