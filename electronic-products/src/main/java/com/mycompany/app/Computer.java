package com.mycompany.app;

public class Computer extends ElectronicProduct implements IConnection,GamePlayable,IGuarantee {
 private double processorSpeed;
 private String processorTechnology;
 private String processorBrand;
 private String RAM;
 private String graphicsCardBrand;
 private String graphicsCardBrandModel;
public double getProcessorSpeed() {
	return processorSpeed;
}
public void setProcessorSpeed(double processorSpeed) {
	this.processorSpeed = processorSpeed;
}
public String getProcessorTechnology() {
	return processorTechnology;
}
public void setProcessorTechnology(String processorTechnology) {
	this.processorTechnology = processorTechnology;
}
public String getProcessorBrand() {
	return processorBrand;
}
public void setProcessorBrand(String processorBrand) {
	this.processorBrand = processorBrand;
}
public String getRAM() {
	return RAM;
}
public void setRAM(String rAM) {
	RAM = rAM;
}
public String getGraphicsCardBrand() {
	return graphicsCardBrand;
}
public void setGraphicsCardBrand(String graphicsCardBrand) {
	this.graphicsCardBrand = graphicsCardBrand;
}
public String getGraphicsCardBrandModel() {
	return graphicsCardBrandModel;
}
public void setGraphicsCardBrandModel(String graphicsCardBrandModel) {
	this.graphicsCardBrandModel = graphicsCardBrandModel;
}
@Override
public void ConnectWifi() {
	System.out.println("Bilgisayar wifi'ya bağlanır.");
	
}
@Override
public void Play() {
	System.out.println("Bilgisayar oyun oynatır.");
	
}
@Override
public void Guarantee() {
	System.out.println("1 Yıllık Garantisi var.");
	
}

	
}


