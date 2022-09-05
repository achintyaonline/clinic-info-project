package com.achintya.clinic.service.app;

import com.achintya.clinic.service.app.model.Clinic;
import com.achintya.clinic.service.app.repo.ClinicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClinicController {

    @Autowired
    private ClinicRepository repo;

    @GetMapping("/hello")
    public Clinic hello() {

        return Clinic.builder().name("TestName").address("ADDR1").build();
    }

    @PostMapping("/clinic")
    public String saveClinic(@RequestBody Clinic clinic){
        repo.save(clinic);

        return "Added Successfully";
    }

    @GetMapping("/clinic")
    public List<Clinic> getClinics() {
        return repo.findAll();
    }

    @DeleteMapping("/clinic/{id}")
    public String deleteClinic(@PathVariable long id){
        repo.deleteById(id);
        return "Deleted Successfully";
    }
}
