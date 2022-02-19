package controller;

import model.Prisoner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.PrisonerServiceImpl;

@Controller
@RequestMapping("/pri")
public class PriController {
    @Autowired
    private PrisonerServiceImpl prisonerService;

    @GetMapping("")
    public String show(Model model) {
        Iterable<Prisoner> prisoners = prisonerService.findAll();
        model.addAttribute("list", prisoners);
        return "/list";
    }
    @GetMapping("/showCreate")
    public String showCreate() {
        return "/create";
    }

    @PostMapping("/createForm")
    public String create(Prisoner prisoner) {
        prisonerService.save(prisoner);
        return "redirect:/pri";
    }
}
