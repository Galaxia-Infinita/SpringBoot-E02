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

import idat.edu.pe.interfaceServicio.IproductoService;
import idat.edu.pe.modelo.Categoria;
import idat.edu.pe.modelo.Producto;

@Controller
@RequestMapping
public class controladorProd {
	@Autowired
	private IproductoService service;
	
	@GetMapping("/productos")
	public String listar(Model model) 
	{
		model.addAttribute("productos",service.listar());
		return "index2";
	}
	
	@GetMapping("/productos/{COD_PRO}")
	public String listarId(@PathVariable int COD_PRO, Model model) {
		model.addAttribute("productos", service.listarCOD_PRO(COD_PRO));
		return "formProducto";
	}
	
	@GetMapping("/nuevoProducto")
	public String nuevo(Model model) {
		model.addAttribute("producto", new Producto());
		return "formProducto";
	}
	
	@PostMapping("/guardarProducto")
	public String save(@Validated Producto p, Model model) {
		int COD_PRO = service.guardarProducto(p);
		if (COD_PRO == 0) {
			return "formProducto";
		}
		return "redirect:/productos";
	}
	
	@GetMapping("/editarProducto/{COD_PRO}")
	public String editar(@PathVariable int COD_PRO, Model model) {
		Optional<Producto> producto=service.listarCOD_PRO(COD_PRO);
		model.addAttribute("producto", producto);
		return "formProducto";
	}
	
	@GetMapping("/borrarProducto/{COD_PRO}")
	public String eliminar(@PathVariable int COD_PRO, Model model) {
		service.borrarProducto(COD_PRO);
		return "redirect:/productos";
	}
}
