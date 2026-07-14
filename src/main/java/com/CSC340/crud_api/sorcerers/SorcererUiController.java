package com.CSC340.crud_api.sorcerers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/sorcerers")
public class SorcererUiController {

    private final SorcererService sorcererService;

    public SorcererUiController(SorcererService sorcererService) {
        this.sorcererService = sorcererService;
    }

    @GetMapping()
    public String getAllSorcerers(Model model) {
        model.addAttribute("sorcererList", sorcererService.getAllSorcerers());
        return "index";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("details/{id}")
    public String getSorcererById(@PathVariable long id, Model model) {
        Sorcerer sorcerer = sorcererService.getSorcererById(id);
        model.addAttribute("sorcerer", sorcerer);
        return "details";
    }

    @GetMapping("/new")
    public String createPostForm(Model model) {
        model.addAttribute("sorcerer", new Sorcerer());
        return "new-character-form";
    }

    @PostMapping("/save")
    public String createSorcerer(Sorcerer sorcerer) {
        if (sorcerer.getImage() != null && sorcerer.getImage().isBlank()) {
            sorcerer.setImage(null);
        }
        Sorcerer createdSorcerer = sorcererService.createSorcerer(sorcerer);
        return "redirect:/sorcerers/" + createdSorcerer.getId();
    }

    @GetMapping("/delete/{id}")
    public String deleteSorcerer(@PathVariable Long id) {
        boolean isDeleted = sorcererService.deleteSorcerer(id);
        if (isDeleted) {
            return "redirect:/sorcerers";
        }
        return "redirect:/sorcerers/" + id + "?error=true";
    }

    @GetMapping("/search")
    public String searchSorcerers(String query, Model model) {
        model.addAttribute("sorcererList", sorcererService.searchSorcerers(query));
        return "index";
    }

}
