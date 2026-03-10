package com.example.da_tantaydo.repository;

import com.example.da_tantaydo.model.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
