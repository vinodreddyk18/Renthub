package com.bellinfo.renthub;

import com.bellinfo.renthub.model.Address;
import com.bellinfo.renthub.model.Apartment;
import com.bellinfo.renthub.service.ApartmentService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestApartmentService {


    Address address;



    @Test
    public void testApartmentSave(){
        Apartment apartment=new Apartment();


      //apartment.setAddress(address);
      apartment.setImageUrl("imgUrl");
      apartment.setZipcode(20148);
      apartment.setLocation("Sterling");
     //apartmentService.insertApartment(apartment);
    }

}
