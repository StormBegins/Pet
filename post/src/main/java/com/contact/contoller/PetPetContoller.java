package com.contact.contoller;

import com.contact.dao.PetPetMapper;
import com.contact.entity.PetPet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/pet")
public class PetPetContoller {

    @Autowired
    private PetPetMapper petPetMapper;

    @RequestMapping(method = RequestMethod.GET)
    public String getPetAll(Model model){
        List<PetPet> petPets = petPetMapper.selectAll();
        model.addAttribute("pet",petPets);
        return "pet";
    }
    @RequestMapping(method = RequestMethod.POST)
    public String UpatePet(PetPet petPet){
        int insert = petPetMapper.insert(petPet);
        return "redirect:/pet";
    };
    @RequestMapping("/up")
    public String PutPet(PetPet petPet){
        int i = petPetMapper.updateByPrimaryKey(petPet);
        return "redirect:/pet";
    };
    @RequestMapping(value = "/del/{id}")
    public String  DelPet(@PathVariable int id){
        int i = petPetMapper.deleteByPrimaryKey(id);
        return "redirect:/pet";
    };
    @RequestMapping(value = "/p")
    public String imgPet( int id,Model model){
        PetPet petPet1 = petPetMapper.selectByPrimaryKey(id);
        System.out.println(petPet1.getName());
        model.addAttribute("pet",petPet1);
        return "pet";
    };
}
