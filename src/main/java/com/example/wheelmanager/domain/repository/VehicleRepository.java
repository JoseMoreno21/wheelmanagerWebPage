package com.example.wheelmanager.domain.repository;

import com.example.wheelmanager.domain.model.Vehicle;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
public interface VehicleRepository extends  JpaRepository<Vehicle, Long>{
}
