package com.rkatanor.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rkatanor.model.Benefit;
@Repository
public interface BenefitJPARepo extends JpaRepository<Benefit, Long>{

}
