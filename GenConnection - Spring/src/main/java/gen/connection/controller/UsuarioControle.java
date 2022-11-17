package gen.connection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsuarioControle {

 	@Autowired
	@GetMapping("/login")
	public String login() {
	 return "usuario/login";
	}
 	
 	@GetMapping("/index")
	public String index() {
	 return "usuario/index";
	}
 	
 	@GetMapping("/professor")
	public String professor() {
	 return "usuario/professor";
	}
}
