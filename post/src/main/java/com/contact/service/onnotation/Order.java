package com.contact.service.onnotation;


import com.contact.service.dao.PetOrderMapper;
import com.contact.service.dao.PetPetMapper;
import com.contact.service.entity.PetOrder;
import com.contact.service.entity.PetPet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/order")
public class Order {

    @Autowired
    private PetOrderMapper petOrderMapper;

    @RequestMapping(method = RequestMethod.GET)
    public String getAllPet(Model model){
        List<PetOrder> petPets = petOrderMapper.selectAll();
        model.addAttribute("petAll",petPets);
        return "";
    };
    @RequestMapping(method = RequestMethod.POST)
    public String insertPet(PetOrder petOrder){
        int insert = petOrderMapper.insert(petOrder);
        return "/pet";
    };

}
