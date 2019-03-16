package com.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.domain.Hotel;
import com.demo.persistence.HotelRepository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@RestController
@AllArgsConstructor
@Getter
@Setter
public class HotelController {

	private HotelRepository hotelRepository;
	
	@GetMapping("/hotels")
	public List<Hotel> getHotels() {
		List<Hotel> hotels = this.hotelRepository.findAll();
		return hotels;
	}
}
