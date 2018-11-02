package com.test.controller;


import com.test.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.Locale;

@Controller
@RequestMapping("/c")
public class CategoryController {

    @Autowired
    private CategoryController categoryController;

    @RequestMapping(method = RequestMethod.GET)
    public String getCategory( Category category){
        System.out.println("dsfdsfsd");
        return "Category";
    };

    @RequestMapping(method = RequestMethod.POST)
    public String insertCategory(@Valid Category category, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "Category";
        };
        return "success";
    };
/*    @RequestMapping( method = RequestMethod.POST)
    public String errorCategory(Category category, BindingResult bindingResult){
        if (category.getId()>4){
            bindingResult.rejectValue("id",null,"error");
            System.out.println("error");
            return "Category";

        }
        if (bindingResult.hasErrors()) {
            return "Category";
        }
      return "success";
    };*/
    @Autowired
    private LocaleResolver localeResolver;

    @GetMapping("/cc/{loc}")
    public String language(@PathVariable("loc") String localeStr, HttpServletRequest req, HttpServletResponse resp){
        localeResolver.setLocale(req,resp,new Locale(localeStr));
        return "redirect: /c";
    };
}
