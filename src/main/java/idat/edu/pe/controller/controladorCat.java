package idat.edu.pe.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import idat.edu.pe.interfaceServicio.IcategoriaService;
import idat.edu.pe.modelo.Categoria;

@Controller
@RequestMapping
public class controladorCat {
	@Autowired
	private IcategoriaService service;
	
	@GetMapping("/categorias")
	public String listar(Model model) 
	{
		model.addAttribute("categorias",service.listar());
		return "index";
	}
	
	@GetMapping("/categorias/{COD_CAT}")
	public String listarCOD_CAT(@PathVariable int COD_CAT, Model model) {
		model.addAttribute("categorias", service.listarCOD_CAT(COD_CAT));
		return "formCategoria";
	}
	
	@GetMapping("/nuevaCategoria")
	public String nuevo(Model model) {
		model.addAttribute("categoria", new Categoria());
		return "formCategoria";
	}
	
	@PostMapping("/guardarCategoria")
	public String save(@Validated Categoria c, Model model) {
		int COD_CAD = service.guardarCategoria(c);
		if (COD_CAD == 0) {
			return "formCategoria";
		}
		return "redirect:/categorias";
	}
	
	@GetMapping("/editarCategoria/{COD_CAT}")
	public String editar(@PathVariable int COD_CAT, Model model) {
		Optional<Categoria> categoria=service.listarCOD_CAT(COD_CAT);
		model.addAttribute("categoria", categoria);
		return "formCategoria";
	}
	
	@GetMapping("/borrarCategoria/{COD_CAT}")
	public String eliminar(@PathVariable int COD_CAT, Model model) {
		service.borrarCategoria(COD_CAT);
		return "redirect:/categorias";
	}
	
}
