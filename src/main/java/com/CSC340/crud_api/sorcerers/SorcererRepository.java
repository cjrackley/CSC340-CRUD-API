package com.CSC340.crud_api.sorcerers;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  SorcererRepository extends JpaRepository<Sorcerer, Long>{
    List<Sorcerer> findByNameContainingIgnoreCaseOrDescriptionContainingIgnoreCase(String nameKeyword, String descriptionKeyword);

    List<Sorcerer> findByGradeContainingIgnoreCase(String grade);
}
