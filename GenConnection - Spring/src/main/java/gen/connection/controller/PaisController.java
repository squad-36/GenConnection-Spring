package gen.connection.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import gen.connection.entidades.Usuario;
import gen.connection.repositorio.PermissaoRepositorio;
import gen.connection.repositorio.UsuarioRepositorio;
import gen.connection.utils.SenhaUtils;

@Controller
@RequestMapping("/pais")
public class PaisController {

	 @Autowired
	    private UsuarioRepositorio usuarioRepositorio;

	    @Autowired
	    private PermissaoRepositorio permissaoRepositorio;


//	    @GetMapping
//	    public ModelAndView aluno() {
//	        ModelAndView modelAndView = new ModelAndView("alunos/aluno");
	//
//	        modelAndView.addObject("usuario", usuarioRepositorio.findAll());
	//
//	        return modelAndView;
//	    }

	    @GetMapping("/{id}")
	    public ModelAndView professor(@PathVariable Long id) {
	        ModelAndView modelAndView = new ModelAndView("pais/pais");

	        modelAndView.addObject("usuario", usuarioRepositorio.getOne(id));

	        return modelAndView;
	    }

	    @GetMapping("/cadastrar")
	    public ModelAndView cadastrar() {
	        ModelAndView modelAndView = new ModelAndView("pais/pais");

	        modelAndView.addObject("usuario", new Usuario());
	      

	        return modelAndView;
	    }

	    @GetMapping("/{id}/editar")
	    public ModelAndView editar(@PathVariable Long id) {
	        ModelAndView modelAndView = new ModelAndView("pais/cadastro");

	        modelAndView.addObject("usuario", usuarioRepositorio.getOne(id));
	     modelAndView.addObject("permissao", permissaoRepositorio.findAll());
	      

	        return modelAndView;
	    }

	    @PostMapping("/cadastrar")
	    public String cadastrar(Usuario usuario) {
	        String senhaEncriptada = SenhaUtils.encode(usuario.getSenha());

	        usuario.setSenha(senhaEncriptada);
	        usuarioRepositorio.save(usuario);

	        return "redirect:/professores";
	    }

	   

	    @GetMapping("/{id}/excluir")
	    public String excluir(@PathVariable Long id) {
	    	usuarioRepositorio.deleteById(id);

	        return "redirect:/professores";
	    }
		 
//		 @PostMapping({"/cadastrar", "/{id}/editar"})
//		    public String salvar(Usuario usuario) {
//		        usuarioRepositorio.save(usuario);
	//
//		        return "redirect:/alunos";
//		    }

		 
		 
		 @GetMapping("/pais")
		    public ModelAndView pais() {	    
			 ModelAndView modelAndView = new ModelAndView("pais/pais");
			 return modelAndView;
		    }
		 
		 @GetMapping("/meusCursos")
		    public ModelAndView meusCursos() {	    
			 ModelAndView modelAndView = new ModelAndView("professores/meusCursos");
			 return modelAndView;
		    }
		 

		 @GetMapping("/login")
		    public ModelAndView login() {	    
			 ModelAndView modelAndView = new ModelAndView("alunos/login");
			 return modelAndView;
		    }
		 
		
		 
		 @GetMapping("/perfil") public ModelAndView perfil(Principal principal) {
			  ModelAndView modelAndView = new ModelAndView("alunos/perfil");
		          Usuario alunos =
				  usuarioRepositorio.findByEmail(principal.getName()).get();
				  modelAndView.addObject("alunos", alunos);
				  modelAndView.addObject("alterarSenhaForm", new Object());
				  
				 return modelAndView; }
}
