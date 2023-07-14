package idat.edu.pe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//controlador para que muestre pagina principal por defecto y para que no bote error de mapping
@Controller
public class controladorHome {
	@GetMapping("/")
	public String busqueda(Model model) 
	{
		return "home";
	}
}
