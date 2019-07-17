package com.tw.apistackbase.core;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static java.lang.Integer.parseInt;

/**
 * Created by jxzhong on 18/08/2017.
 */
@RestController
@RequestMapping("/companies")
public class Controller {

    Company company=new Company();

    CompanyRespository companyR;
    ProfileRespository profileRespository;
    public Company getCompany() {
        this.company.setName("test");
        return company;
    }

    @PostMapping
    public ResponseEntity returnCompany(@RequestBody String name){
        Profile profile=new Profile("why","34");
        Company company=getCompany();
        companyR.save(company);
        profileRespository.save(profile);
        Profile newprofile=profileRespository.findByName(name).get(0);
        Company returnCompany=companyR.findAll().get(0);
        returnCompany.setProfile(newprofile);
        return ResponseEntity.ok().body(returnCompany);
    }

}
