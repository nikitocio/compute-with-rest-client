package server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import server.service.ComputePiService;

import java.math.BigDecimal;

/**
 * @author nivanov, <a href="mailto:Nikita.Ivanov@returnonintelligence.com">Ivanov Nikita</a>
 * @since 01-Oct-17
 */
@RestController
public class ComputePiController{

	@Autowired
	private ComputePiService computePiService;

	@RequestMapping(value = "/compute_pi" , method = RequestMethod.GET)
	public  @ResponseBody String computePi(@RequestParam("startIndex")long startIndex, @RequestParam("endIndex")long endIndex) {
		return computePiService.calculatePi(startIndex, endIndex).toString();
	}
}
