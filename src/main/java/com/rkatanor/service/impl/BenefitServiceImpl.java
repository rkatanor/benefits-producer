package com.rkatanor.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rkatanor.JpaRepository.BenefitJPARepo;
import com.rkatanor.model.Benefit;
import com.rkatanor.service.BenefitService;

@Service
public class BenefitServiceImpl implements BenefitService {
	@Autowired
	BenefitJPARepo repo;

	@Override
	public Benefit saveBenefit(Benefit b) {
		// TODO Auto-generated method stub
		return repo.save(b);
	}

	@Override
	public List<Benefit> getBenefits() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
