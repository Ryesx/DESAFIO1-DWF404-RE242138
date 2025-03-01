package sv.edu.udb.desafio1dwf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sv.edu.udb.desafio1dwf.repository.MateriaRepository;

@Controller
public class MateriaController {

    @Autowired
    private MateriaRepository materiaRepository;

    @GetMapping("/materias")
    public String listarMaterias(Model model) {
        model.addAttribute("materias", materiaRepository.findAll());
        return "materias";
    }
}