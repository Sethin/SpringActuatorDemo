package com.bjs.cunglassController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bjs.sunglassDto.Sunglass;

@RestController
public class SunglassController {

	@GetMapping("/sunglass")
	public List<Sunglass> getAllSunglasses() {
		List<Sunglass> listOfSunglass = new ArrayList<Sunglass>();
		listOfSunglass.add(new Sunglass("RayBan", "100"));
		listOfSunglass.add(new Sunglass("Prada", "120"));
		listOfSunglass.add(new Sunglass("Bruci", "130"));
		return listOfSunglass;
	} 
}
