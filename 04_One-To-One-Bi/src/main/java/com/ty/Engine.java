package com.ty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Engine {

	@Id
	private int eid;
	private int cc;

	@OneToOne(mappedBy = "engine")
	private Car car;

	@Override
	public String toString() {
		return "Engine [eid=" + eid + ", cc=" + cc + "]";
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

}
