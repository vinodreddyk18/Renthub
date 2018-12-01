package com.bellinfo.renthub.controller;

import com.bellinfo.renthub.model.Apartment;
import com.bellinfo.renthub.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ApartmentController {

    @Autowired(required = true)
    ApartmentService apartmentService;
    String appName;

    @RequestMapping(value="/home",method = RequestMethod.GET)
    public String homePage(Model model){

        model.addAttribute("appName", appName);
        return "home";
    }

    @RequestMapping(value="/save",method = RequestMethod.POST)
    public ResponseEntity<Object> save(@RequestBody Apartment apartment, BindingResult result, Model model){
        model.addAttribute("message", apartmentService.getApartment());
        System.out.println(apartment);
        apartmentService.insertApartment(apartment);
        return ResponseEntity.accepted().body(" ") ;
    }
    @RequestMapping(value="/get",method = RequestMethod.GET)
    public List<Apartment> getall(){

        return apartmentService.getApartment();
    }

    @RequestMapping(value = "/get/{zipcode}", method = RequestMethod.GET)
    public List<Apartment> getSelectedApartments(@PathVariable Integer zipcode){

        return apartmentService.getSelectedApartments(zipcode);
    }


}
