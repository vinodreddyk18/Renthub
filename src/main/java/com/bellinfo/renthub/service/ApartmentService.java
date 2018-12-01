package com.bellinfo.renthub.service;

import com.bellinfo.renthub.repository.ApartmentRepository;
import com.bellinfo.renthub.model.Apartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApartmentService {

    @Autowired
    private ApartmentRepository apartmentRepository;

    public void insertApartment(Apartment apartment){

        apartmentRepository.save(apartment);
    }

    public List<Apartment> getApartment(){
        apartmentRepository.findAll().iterator();
        List<Apartment> list= apartmentRepository.findAll();
        System.out.println(apartmentRepository.findAll());
        return list;
    }

    public List<Apartment> getSelectedApartments(Integer zipcode){
        List<Apartment> apartment= apartmentRepository.findByZipcode(zipcode);
        System.out.println(apartment);
        return apartment;
    }
}
