package co.com.itsense.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import co.com.itsense.models.Articulo;
import co.com.itsense.services.ArticuloService;
import lombok.var;
import lombok.extern.slf4j.Slf4j;



@Controller
@Slf4j
public class ArticuloControlador {
	
	@Autowired
	private ArticuloService articuloService;
	
	@GetMapping("/")
	public  String inicio(Model model) {
		var articulos =  articuloService.listarArticulo();
		
		log.info("EJECUTANDO EL CONTROLADOR SPRING MVC");
		
		model.addAttribute("articulos", articulos);

		return "index";
	}
	
	@GetMapping("/agregar")
	public String agregar(Articulo articulo) {
		
		
		
		return "modificar";
	}
	
	
	@PostMapping("/guardar")
	public String guardar(Articulo articulo) {
		
		articuloService.guardar(articulo);
		
		return "redirect:/";
	}
	
	@GetMapping("/editar/{idArticulo}")
	public String editar(Articulo articulo, Model model) {
		articulo = articuloService.encontrarArticulo(articulo);
		model.addAttribute("articulo", articulo);
		
		return "modificar";
	}
	
	
	@GetMapping("/eliminar/{idArticulo}")
	public String eliminar(Articulo articulo) {
		articuloService.eliminar(articulo);
		return "redirect:/";
	}
	
	/*
	 * @GetMapping("/all")
	public List<Articulo>getAll(){
		return articuloService.getAll();	
	}
	
	@GetMapping("/byId")
	public Articulo getById(@RequestParam("id") Long id) {
		return articuloService.getById(id);
	}
	 */
	
	
	
	
}
