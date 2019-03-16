package com.demo.persistence;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.demo.domain.Hotel;

@Component
public class DBLoader implements CommandLineRunner {
	private HotelRepository hotelRepository;

	public DBLoader(HotelRepository hotelRepository) {
		this.hotelRepository = hotelRepository;
	}
	public void run(String... args) throws Exception {
		Hotel marriott = new Hotel("Marriott", 5, true);
		Hotel hilton = new Hotel("DC Hilton", 4, true);
		Hotel motel6 = new Hotel("Motel6", 4, true);
		List<Hotel> hotels = new ArrayList<Hotel>();
		
		hotels.add(marriott);
		hotels.add(hilton);
		hotels.add(motel6);
		
		hotelRepository.saveAll(hotels);
	}

}
