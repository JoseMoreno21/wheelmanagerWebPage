package com.example.wheelmanager.domain.repository;

import com.example.wheelmanager.domain.model.CreditCard;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CreditCardRepository extends  JpaRepository<CreditCard, Long>{

}
