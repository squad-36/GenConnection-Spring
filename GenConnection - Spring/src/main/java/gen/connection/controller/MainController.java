package gen.connection.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	 @GetMapping("/index")
	    public String index() {
	        return "index";
	    }
	 @GetMapping("/cadastrar")
	    public String cadastrar() {
	        return "cadastrar";
	    }
	 @GetMapping("/pais")
	    public String pais() {
	        return "pais";
	    }
	 @GetMapping("/meusCursos")
	    public String meusCursos() {
	        return "meusCursos";
	    }
	 @GetMapping("/meusAlunos")
	    public String meusAlunos() {
	        return "meusAlunos";
	    }
	 @GetMapping("/jogos")
	    public String jogos() {
	        return "jogos";
	    }
	 @GetMapping("/atividades")
	    public String atividades() {
	        return "atividades";
	    }
	 @GetMapping("/aluno")
	    public String aluno() {
	        return "aluno";
	    }
	 @GetMapping("/professor")
	    public String professor() {
	        return "professor";
	    }
	 @GetMapping("/entrar")
	    public String entrar() {
	        return "entrar";
	    }
}
