package upn.pe.aplica03.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upn.pe.aplica03.AuthenticationBean;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/auto")
public class LoginController {

	@GetMapping(path = "/login")
	public AuthenticationBean basicauth() {
		return new AuthenticationBean("a auto feliz");
	}
}
