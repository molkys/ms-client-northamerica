package ms.client.northamerica.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NorthamericaRestController {

	@Value("${ms-client}") String msClient;

	@RequestMapping(value="/getMsClient")
	public String getMsClient() {
		return "Rest Controller with ms-client: " + msClient;
	}
}
