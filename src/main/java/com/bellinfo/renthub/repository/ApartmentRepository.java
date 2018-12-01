package com.bellinfo.renthub.repository;

import com.bellinfo.renthub.model.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApartmentRepository extends JpaRepository<Apartment,Integer> {

    @Query(value = "SELECT * FROM Apartment u WHERE u.zipcode = ?1",nativeQuery = true)
    List<Apartment> findByZipcode(Integer zipcode);
}

