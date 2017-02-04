package com.vektorel.kalýtým3;

public class Araba {

	protected double motorGucu;
	private int model;
	private String markasi;
	
	public void yaz(){
		System.out.println(model);
		System.out.println(motorGucu);
		System.out.println(markasi);
	}
	public void hareketEt(){
		System.out.println("Araba - Hareket Et");
	}

	public void fren(){
		
		System.out.println("Araba - Fren");
	}

	public double getMotorGucu() {
		return motorGucu;
	}

	public void setMotorGucu(double motorGucu) {
		this.motorGucu = motorGucu;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public String getMarkasý() {
		return markasi;
	}

	public void setMarkasý(String markasý) {
		this.markasi = markasý;
	}


	
}
