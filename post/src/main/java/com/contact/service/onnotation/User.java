package com.contact.service.onnotation;

import com.contact.service.dao.PetOrderMapper;
import com.contact.service.dao.PetUserMapper;
import com.contact.service.entity.PetOrder;
import com.contact.service.entity.PetUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/user")
public class User {

    @Autowired
    private PetUserMapper petUserMapper;

    @RequestMapping(method = RequestMethod.GET)
    public String getAllPet(Model model){
        List<PetUser> petPets = petUserMapper.selectAll();
        model.addAttribute("petAll",petPets);
        return "";
    };
    @RequestMapping(method = RequestMethod.POST)
    public String insertPet(PetUser PetUser){
        int insert = petUserMapper.insert(PetUser);
        return "/pet";
    };

}

