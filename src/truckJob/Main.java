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
		trucks.get(2).setDriver(drivers.get(2));
		
		ArrayList<Dispacher> dispachers= new ArrayList<Dispacher>();
		dispachers.add(new Dispacher("Ahmed", "Dolandırmaz", "785789415987", "gvbv3t5b"));
		dispachers.add(new Dispacher("İsmet", "Dolandırabilir", "6386245635", "v3tv3vtv3v"));
		dispachers.add(new Dispacher("Ahmed", "Dolandırır", "645862568", "tvb35v3t5v"));
		
		ArrayList<Company> companies=new ArrayList<Company>();
		companies.add(new Company("Karakaçan", "6876485614856", "r4cn4 c4 c4 c4 c 4c 4"));
		companies.add(new Company("Karakaçmaz", "768746", "dhc 2cr c c re c er"));
		companies.add(new Company("Sina", "64872645823","fceu cr cr  ce rc ec er" ));
		
		ArrayList<Job> jobs=new ArrayList<Job>();
		jobs.add(new Job("Ostim Organize Sanayi/Ankara", "İkitelli Organize Sanayi/İstanbu", 12843.35, 24348.93, 423, companies.get(0), trucks.get(0), dispachers.get(0)));
		jobs.add(new Job("İzmir", "Samsun", 34578.03, 28123.47, 2147, companies.get(1), trucks.get(1) ,dispachers.get(1) ));
		jobs.add(new Job("Bolu", "Ankara", 23578.03, 08123.47, 3247, companies.get(2), trucks.get(2) ,dispachers.get(2) ));
		
		for(Job job:jobs) {
			System.out.println("<------"+job.getJobFrom()+"-"+job.getJobDestination()+"------>");
			System.out.println("---İş Bilgileri---");
			System.out.println("Nereden :"+job.getJobFrom());
			System.out.println("Nereye :"+job.getJobDestination());
			System.out.println("Tutar :"+job.getCost()+"TL");
			System.out.println("Ağırlık :"+job.getWeight()+"KG");
			System.out.println("Mesafe :"+job.getDestinationRange()+"KM");
			System.out.println("---Müşteri Bilgileri---");
			System.out.println("Şirekt Adı :"+job.getCompany().getName());
			System.out.println("Şirket Telefon"+job.getCompany().getPhone());
			System.out.println("Şirket Adresi"+job.getCompany().getAddress());
			System.out.println("---Araç Bilgiler---");
			System.out.println("Plaka :"+job.getTruck().getPlateName());
			System.out.println("Marka :"+job.getTruck().getBrand());
			System.out.println("Model :"+job.getTruck().getModel());
			System.out.println("Sürücü Bilgileri");
			System.out.println("İsim : "+job.getDispacher().getName()+" "+job.getDispacher().getSurname());
		 	System.out.println("Telefon : "+job.getDispacher().getPhone());
		 	System.out.println("E-Posta : "+job.getDispacher().getMail());

		}

	}

}
