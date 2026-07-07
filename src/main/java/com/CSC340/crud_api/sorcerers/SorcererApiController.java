package com.CSC340.crud_api.sorcerers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/sorcerers")
public class SorcererApiController {

    private final SorcererService sorcererService;

    public SorcererApiController(SorcererService sorcererService) {
        this.sorcererService = sorcererService;
    }

    @GetMapping("/test")
    public String test() {
        return "Test from SorcererController";
    }

    @GetMapping
    public ResponseEntity<List<Sorcerer>> getAllSorcerers() {
        List<Sorcerer> sorcerers = sorcererService.getAllSorcerers();
        return ResponseEntity.ok(sorcerers);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sorcerer> getSorcererById(@PathVariable long id) {
        Sorcerer sorcerer = sorcererService.getSorcererById(id);
        if (sorcerer != null) {
            return ResponseEntity.ok(sorcerer);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Sorcerer> createSorcerer(@RequestBody Sorcerer sorcerer) {
        Sorcerer createdSorcerer = sorcererService.createSorcerer(sorcerer);
        return ResponseEntity.ok(createdSorcerer);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Sorcerer> updateSorcerer(@PathVariable long id, @RequestBody Sorcerer updatedSorcerer) {
        Sorcerer sorcerer = sorcererService.updateSorcerer(id, updatedSorcerer);
        if (sorcerer != null) {
            return ResponseEntity.ok(sorcerer);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSorcerer(@PathVariable long id) {
        boolean deleted = sorcererService.deleteSorcerer(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/search")
    public ResponseEntity<List<Sorcerer>> searchSorcerers(@RequestParam String query) {
        List<Sorcerer> sorcerers = sorcererService.searchSorcerers(query);
        return ResponseEntity.ok(sorcerers);
    }

    @GetMapping("/grade")
    public ResponseEntity<List<Sorcerer>> getSorcerersByGrade(@RequestParam String name) {
        List<Sorcerer> sorcerers = sorcererService.getSorcererByGrade(name);
        return ResponseEntity.ok(sorcerers);
    }
}
