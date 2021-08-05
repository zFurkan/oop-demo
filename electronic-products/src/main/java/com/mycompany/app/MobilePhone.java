package com.mycompany.app;

public class MobilePhone extends ElectronicProduct implements IConnection,GamePlayable,IGuarantee {
	 private String processorSpeed;
	 private String processorTechnology;
	 private String screenType;
	 private String RAM;
	 private String screenSize;
	 private String mobileDataRate;
	 private String cameraResolution;
	 private String internalMemory;
	 private String operatingSystem;
	public String getProcessorSpeed() {
		return processorSpeed;
	}
	public void setProcessorSpeed(String processorSpeed) {
		this.processorSpeed = processorSpeed;
	}
	public String getProcessorTechnology() {
		return processorTechnology;
	}
	public void setProcessorTechnology(String processorTechnology) {
		this.processorTechnology = processorTechnology;
	}
	public String getScreenType() {
		return screenType;
	}
	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}
	public String getRAM() {
		return RAM;
	}
	public void setRAM(String rAM) {
		RAM = rAM;
	}
	public String getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}
	public String getMobileDataRate() {
		return mobileDataRate;
	}
	public void setMobileDataRate(String mobileDataRate) {
		this.mobileDataRate = mobileDataRate;
	}
	public String getCameraResolution() {
		return cameraResolution;
	}
	public void setCameraResolution(String cameraResolution) {
		this.cameraResolution = cameraResolution;
	}
	public String getInternalMemory() {
		return internalMemory;
	}
	public void setInternalMemory(String internalMemory) {
		this.internalMemory = internalMemory;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	 public void call() {
		 System.out.println("Telefon arama yapar");
		
	 }
	 public void takePhoto() {
		 System.out.println("Telefon fotoğraf çeker");
	 }
	public void  sendMessage() {
		System.out.println("Telefon mesaj gönderir");
	}
	@Override
	public void ConnectWifi() {
		System.out.println("Telefon wifi'ya bağlanır.");
		
	}
	@Override
	public void Play() {
		System.out.println("Telefon oyun oynatır.");
		
	}
	@Override
	public void Guarantee() {
		System.out.println("2 Yıllık Garantisi var.");
		
	}
	
		

}
