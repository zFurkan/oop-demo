package com.mycompany.app;

public class Dishwasher extends HouseholdAppliances implements IGuarantee,IClean {

	
	private String dishCapacity;
	private String waterConsumption;
	
	
	@Override
	public void Clean() {
		System.out.println("3 Yıllık Garantisi var.");
		
	}

	@Override
	public void Guarantee() {
		System.out.println("Bulaşık makinesi bulaşıkları temizler.");
	}

	public String getDishCapacity() {
		return dishCapacity;
	}

	public void setDishCapacity(String dishCapacity) {
		this.dishCapacity = dishCapacity;
	}

	public String getWaterConsumption() {
		return waterConsumption;
	}

	public void setWaterConsumption(String waterConsumption) {
		this.waterConsumption = waterConsumption;
	}

}
