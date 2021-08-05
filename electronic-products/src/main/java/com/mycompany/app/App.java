package com.mycompany.app;


public class App 
{
    public static void main( String[] args )
    {
        Laptop computer = AddComputer();
        ListComputer(computer);
        computer.Guarantee();
        System.out.println("-------------------------------------------------------");
        computer.Mobile();
        computer.Run();
        computer.ConnectWifi();
        
        System.out.println("********************************************************");
        System.out.println("-------------------------------------------------------");
        System.out.println("********************************************************");
        
        MobilePhone phone = AddPhone();
        
        ListPhone(phone);
        phone.Guarantee();
        System.out.println("-------------------------------------------------------");
        phone.Run();
        phone.takePhoto();
        phone.call();
        phone.ConnectWifi();
        phone.Play();
        System.out.println("********************************************************");
        System.out.println("-------------------------------------------------------");
        System.out.println("********************************************************");
        
        Fridge fridge = AddFridge();
        
        ListFridge(fridge);
        
        fridge.Run();
        fridge.Cool();
        fridge.Frezee();
        
        System.out.println("********************************************************");
        System.out.println("-------------------------------------------------------");
        System.out.println("********************************************************");
        
        
        
        
        
        
        
    }

	private static void ListFridge(Fridge fridge) {
		System.out.println("Ürün Özellikleri:");
        System.out.println("-------------------------------------------------------");
        System.out.println("Ürünün adı: "+fridge.getName());
        System.out.println("Model: "+fridge.getModel());
        System.out.println("Renk: "+fridge.getColour());
        System.out.println("Enerji Sınıfı: "+fridge.getEnergyClass());
        System.out.println("Kapasite: "+fridge.getCapacity());
        System.out.println("Soğutma Türü: "+fridge.getCoolingType());
        System.out.println("Yükseklik: "+fridge.getHeight());
        System.out.println("Ağırlık: "+fridge.getWeight());
        System.out.println("Fiyat: "+fridge.getPrice());
	}

	private static Fridge AddFridge() {
		Fridge fridge = new Fridge();
        fridge.setName("Vestel Buzdolabı");
        fridge.setModel("Retro");
        fridge.setColour("Siyah");
        fridge.setEnergyClass("F");
        fridge.setCapacity("330 Litre");
        fridge.setCoolingType("No-Frost");
        fridge.setHeight("190");
        fridge.setWeight(70);
        fridge.setPrice(6800);
		return fridge;
	}

	private static void ListPhone(MobilePhone phone) {
		System.out.println("Ürün Özellikleri:");
        System.out.println("-------------------------------------------------------");
        System.out.println("Ürünün adı: "+phone.getName());
        System.out.println("Renk: "+phone.getColour());
        System.out.println("Model: "+phone.getModel());
        System.out.println("İşlemci Hızı: "+phone.getProcessorSpeed());
        System.out.println("İşlemci Teknolojisi: "+phone.getProcessorTechnology());
        System.out.println("Ekran Tipi: "+phone.getScreenType());
        System.out.println("Ekran Boyutu: "+phone.getScreenSize());
        System.out.println("RAM: "+phone.getRAM());
        System.out.println("Mobil veri hızı: "+phone.getMobileDataRate());
        System.out.println("Kamera: "+phone.getCameraResolution());
        System.out.println("Dahili Hafıza: "+phone.getInternalMemory());
        System.out.println("İşletim Sistemi: "+phone.getOperatingSystem());
        System.out.println("Fiyat: "+phone.getPrice());
	}

	private static MobilePhone AddPhone() {
		MobilePhone phone = new MobilePhone();
        phone.setName("iPhone ");
        phone.setColour("White");
        phone.setModel("iPhone 11");
        phone.setProcessorSpeed("2.74 GHz");
        phone.setProcessorTechnology("A13");
        phone.setScreenType("LCD");
        phone.setRAM("4GB");
        phone.setScreenSize("6.5 inch");
        phone.setMobileDataRate("4.5G");
        phone.setCameraResolution("12 MP + 12 MP");
        phone.setInternalMemory("64 GB");
        phone.setOperatingSystem("IOS");
        phone.setPrice(7600);
		return phone;
	}

	private static void ListComputer(Laptop computer) {
		System.out.println("Ürün Özellikleri:");
        System.out.println("-------------------------------------------------------");
        System.out.println("Marka: "+computer.getName());
        System.out.println("Ürün Modeli: "+computer.getModel());
        System.out.println("Renk: "+computer.getColour());
        System.out.println("Ekran Kartı: "+computer.getGraphicsCardBrand());
        System.out.println("Ekran Kartı Modeli: "+computer.getGraphicsCardBrandModel());
        System.out.println("İşlemci Markası: "+computer.getProcessorBrand());
        System.out.println("İşlemci Hızı:  "+computer.getProcessorSpeed());
        System.out.println("İşlemci Teknolojisi: "+computer.getProcessorTechnology());
        System.out.println("RAM: "+computer.getRAM());
        System.out.println("Ağırlık: "+computer.getWeight());
        System.out.println("Fiyat: "+computer.getPrice()+"TL");
	}

	private static Laptop AddComputer() {
		Laptop computer = new Laptop();
        computer.setName("Lenovo");
        computer.setColour("Siyah");
        computer.setGraphicsCardBrand("Nvidia");
        computer.setGraphicsCardBrandModel("RTX2060");
        computer.setModel("Gaming Laptop");
        computer.setProcessorBrand("Intel");
        computer.setProcessorSpeed(2.7);
        computer.setProcessorTechnology("Core i7");
        computer.setRAM("16GB");
        computer.setWeight(1390);
        computer.setPrice(9800.00);
		return computer;
	}
}
