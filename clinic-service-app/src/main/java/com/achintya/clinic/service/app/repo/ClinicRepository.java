package com.achintya.clinic.service.app.repo;

import com.achintya.clinic.service.app.model.Clinic;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClinicRepository extends MongoRepository<Clinic,Long> {
}
