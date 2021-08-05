package com.mycompany.app;

public class WashingMachine extends HouseholdAppliances implements IGuarantee,IClean{

	
	private String washingCapacity;
	private String cycle;
	
	
	
	@Override
	public void Guarantee() {
		System.out.println("3 Yıllık Garantisi var.");
		
	}



	@Override
	public void Clean() {
		 System.out.println("Çamaşır makinesi elbiseleri temizler.");
		
	}



	public String getWashingCapacity() {
		return washingCapacity;
	}



	public void setWashingCapacity(String washingCapacity) {
		this.washingCapacity = washingCapacity;
	}



	public String getCycle() {
		return cycle;
	}



	public void setCycle(String cycle) {
		this.cycle = cycle;
	}

}
