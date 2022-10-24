package truckJob;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Driver> drivers= new ArrayList<Driver>();
		drivers.add(new Driver("Abdulkerimoviç", "Bin Laden", "0373543745"));
		drivers.add(new Driver("Furkanoviç", "Karacaviç", "38467364786"));
		drivers.add(new Driver("Osman", "Hamza Ahmed", "83 58 43 5687943756"));
		
		ArrayList<Truck> trucks=new ArrayList<Truck>();
		trucks.add(new Truck("13 ABD 123", "Scania", "2020"));
		trucks.get(0).setDriver(drivers.get(0));
		trucks.add(new Truck("34 UK 222", "Doge", "1960",drivers.get(1)));
		trucks.add(new Truck());
		trucks.get(2).setPlateName("35 ABC 866");
		trucks.get(2).setBrand("Mercedes");
		trucks.get(2).setModel("2024");
		trucks.get(2).setDriver(drivers.get(1));
		
		ArrayList<Dispacher> dispachers= new ArrayList<Dispacher>();
		dispachers.add(new Dispacher("Ahmed", "Dolandýrmaz", "785789415987", "gvbv3t5b"));
		dispachers.add(new Dispacher("Ýsmet", "Dolandýrabilir", "6386245635", "v3tv3vtv3v"));
		dispachers.add(new Dispacher("Ahmed", "Dolandýrýr", "645862568", "tvb35v3t5v"));
		
		ArrayList<Company> companies=new ArrayList<Company>();
		companies.add(new Company("Karakaçan", "6876485614856", "r4cn4 c4 c4 c4 c 4c 4"));
		companies.add(new Company("Karakaçmaz", "768746", "dhc 2cr c c re c er"));
		companies.add(new Company("Sina", "64872645823","fceu cr cr  ce rc ec er" ));
	}

}
