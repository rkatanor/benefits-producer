package com.rkatanor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BENEFIT")
public class Benefit {
	@Id
	@Column(name = "BENEFIT_ID")
	private Integer benefit_id;
	@Column(name = "BENEFIT_NAME")
	private String benefit_name;
	@Column(name = "BENEFIT_TYPE")
	private String benefit_type;
	@Column(name = "BENEFIT_COST")
	private String benefit_cost;
	@Column(name = "BENEFIT_PROVIDER")
	private String benefit_provider;

	public Benefit() {
		// TODO Auto-generated constructor stub
	}

	public Integer getBenefit_id() {
		return benefit_id;
	}

	public void setBenefit_id(Integer benefit_id) {
		this.benefit_id = benefit_id;
	}

	public String getBenefit_name() {
		return benefit_name;
	}

	public void setBenefit_name(String benefit_name) {
		this.benefit_name = benefit_name;
	}

	public String getBenefit_type() {
		return benefit_type;
	}

	public void setBenefit_type(String benefit_type) {
		this.benefit_type = benefit_type;
	}

	public String getBenefit_cost() {
		return benefit_cost;
	}

	public void setBenefit_cost(String benefit_cost) {
		this.benefit_cost = benefit_cost;
	}

	public String getBenefit_provider() {
		return benefit_provider;
	}

	public void setBenefit_provider(String benefit_provider) {
		this.benefit_provider = benefit_provider;
	}

	@Override
	public String toString() {
		return "Benefit [benefit_id=" + benefit_id + ", benefit_name=" + benefit_name + ", benefit_type=" + benefit_type
				+ ", benefit_cost=" + benefit_cost + ", benefit_provider=" + benefit_provider + "]";
	}

}
