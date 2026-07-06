package Sorcerers;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SorcererService {
    private final SorcererRepository sorcererRepository;

    public SorcererService(SorcererRepository sorcererRepository) {
        this.sorcererRepository = sorcererRepository;
    }

    public List<Sorcerer> getAllSorcerers() {
        return sorcererRepository.findAll();
    }

    public Sorcerer getSorcererById(long id) {
        return sorcererRepository.findById(id).orElse(null);
    }

    public Sorcerer createSorcerer(Sorcerer sorcerer) {
        return sorcererRepository.save(sorcerer);
    }

    public Sorcerer updateSorcerer(long id, Sorcerer updatedSorcerer) {
        Sorcerer existingSorcerer = sorcererRepository.findById(id).orElse(null);
        if (existingSorcerer != null){
            existingSorcerer.setName(updatedSorcerer.getName());
            existingSorcerer.setDescription(updatedSorcerer.getDescription());
            existingSorcerer.setAge(updatedSorcerer.getAge());
            existingSorcerer.setGrade(updatedSorcerer.getGrade());
            return sorcererRepository.save(existingSorcerer);
        }
        return null;
    }

    public boolean deleteSorcerer(long id) {
        if (sorcererRepository.existsById(id)) {
            sorcererRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public List<Sorcerer> searchSorcerers(String keyword){
        return sorcererRepository.findByNameContainingIgnoreCaseOrDescriptionContainingIgnoreCase(keyword, keyword);
    }

    public List<Sorcerer> getSorcererByGrade(String grade) {
        return sorcererRepository.findByGradeContainingIgnoreCase(grade);
    }
}
