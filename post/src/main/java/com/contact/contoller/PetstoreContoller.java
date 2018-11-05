package com.contact.contoller;

import com.contact.dao.PetOrderMapper;
import com.contact.entity.PetOrder;
import com.contact.entity.PetPet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/o")
public class PetstoreContoller {

    @Autowired
    private PetOrderMapper petOrderMapper;

    @RequestMapping(method = RequestMethod.GET)
    public String getOrderAll(Model model){
        List<PetOrder> petOrders = petOrderMapper.selectAll();
       model.addAttribute("orders",petOrders);
        return "order";
    }
    @RequestMapping(method = RequestMethod.POST)
    public String insertOrder(PetOrder petOrder){
        int insert = petOrderMapper.insert(petOrder);
        return "redirect:/o";
    }
    @RequestMapping(value = "/del/{id}")
    public String  DelPet(@PathVariable int id){
        int i = petOrderMapper.deleteByPrimaryKey(id);
        return "redirect:/o";
    };
    @RequestMapping("/up")
    public String PutPet(PetOrder petOrder){
        int i = petOrderMapper.updateByPrimaryKey(petOrder);
        return "redirect:/o";
    };
}
