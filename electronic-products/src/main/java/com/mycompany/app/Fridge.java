package com.mycompany.app;

public class Fridge extends HouseholdAppliances implements IGuarantee {

	private String capacity;
	private String coolingType;
	@Override
	public void Guarantee() {
		System.out.println("3 Yıllık Garantisi var.");
		}
	
	
	public void Cool() {
		System.out.println("Buzdolabı ürünleri soğutur.");
	}
	
	
	public void Frezee() {
	System.out.println("Buzdolabı ürünleri dondurur.");
}


	public String getCapacity() {
		return capacity;
	}


	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}


	


	

	public String getCoolingType() {
		return coolingType;
	}


	public void setCoolingType(String coolingType) {
		this.coolingType = coolingType;
	}
	
}
