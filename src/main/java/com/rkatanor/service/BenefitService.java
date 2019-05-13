package com.rkatanor.service;

import java.util.List;

import com.rkatanor.model.Benefit;

public interface BenefitService {
	public Benefit saveBenefit(Benefit b);

	public List<Benefit> getBenefits();
}
