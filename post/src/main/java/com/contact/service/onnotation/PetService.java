package com.contact.service.onnotation;

import com.contact.service.dao.PetPetMapper;
import com.contact.service.entity.PetPet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.swing.plaf.PanelUI;
import java.util.List;

@Controller
@RequestMapping("/pet")
public class PetService {

    @Autowired
    PetPetMapper petPetMapper;

    @RequestMapping(method = RequestMethod.GET)
    public String getAllPet(Model model){
        List<PetPet> petPets = petPetMapper.selectAll();
        model.addAttribute("petAll",petPets);
        return "";
    };
    @RequestMapping(method = RequestMethod.POST)
    public String insertPet(PetPet petPet){
        int insert = petPetMapper.insert(petPet);
        return "/pet";
    };

}
