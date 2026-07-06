package Sorcerers;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class SorcererRepository extends JpaRepository<Sorcerer, Long>{
    List<Sorcerer> findByNameContainingIgnoreCaseOrDescriptionContainingIgnoreCase(String nameKeyword, String descriptionKeyword);

    List<Sorcerer> findByGradeContainingIgnoreCase(String grade);
}
