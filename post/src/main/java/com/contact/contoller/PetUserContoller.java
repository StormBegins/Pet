package com.contact.contoller;

import com.contact.dao.PetUserMapper;
import com.contact.entity.PetPet;
import com.contact.entity.PetUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/u")
public class PetUserContoller {
    @Autowired
    private PetUserMapper petUserMapper;

    @RequestMapping(method = RequestMethod.GET)
    public String getUserAll(Model model){
        List<PetUser> petUsers = petUserMapper.selectAll();
        model.addAttribute("user",petUsers);
        return "user";
    };
    @RequestMapping("/up")
    public String PutPet(PetUser petUser){
        int i = petUserMapper.updateByPrimaryKey(petUser);
        return "redirect:/u";
    };
    @RequestMapping(method = RequestMethod.POST)
    public String addUser(PetUser petUser){
        int insert = petUserMapper.insert(petUser);
        return "redirect:/u";
    };
    @RequestMapping(value = "/del/{id}")
    public String insertUser(@PathVariable int id){
        int i = petUserMapper.deleteByPrimaryKey(id);
        return "redirect:/u";
    }
}
