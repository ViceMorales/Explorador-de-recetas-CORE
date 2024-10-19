package com.vicentemorales.controladores;

import java.util.HashMap;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ControladorRecetas {
	private static String listaRecetas[] = {"Pizza", "Espagueti", "Lasaña"};
	private static HashMap<String, String []> recetasConIngredientes = new HashMap<String, String[]>();

	public ControladorRecetas() {
		String [] pizza = {"Pan", "Salsa de tomate", "Queso", "Pepperoni"};
		recetasConIngredientes.put("Pizza", pizza);
		String [] espagueti = {"Pasta", "Salsa de tomate", "Carne molida", "Queso parmesano"};
		recetasConIngredientes.put("Espagueti", espagueti);
		String [] lasaña = {"Pasta", "Salsa de tomate", "Queso", "Albahaca", "Espinaca", "Champiñones"};
		recetasConIngredientes.put("Lasaña", lasaña);
	}
	
	@GetMapping("/recetas")
	public String obtenerTodasLasRecetas(Model model) {
		model.addAttribute("listaRecetas", listaRecetas);
		return "recetas.jsp";
		
	}
	
	@GetMapping("/recetas/{nombre}")
	public String obtenerRecetaPorNombre(@PathVariable ("nombre") String nombre, Model model) {
		String[] ingredientes = recetasConIngredientes.get(nombre);
		  model.addAttribute("nombre", nombre);
	      model.addAttribute("ingredientes", ingredientes);
		return "detalleReceta.jsp";
		
	}

	public static String[] getListaRecetas() {
		return listaRecetas;
	}

	public static void setListaRecetas(String[] listaRecetas) {
		ControladorRecetas.listaRecetas = listaRecetas;
	}

	public static HashMap<String, String[]> getRecetasConIngredientes() {
		return recetasConIngredientes;
	}

	public static void setRecetasConIngredientes(HashMap<String, String[]> recetasConIngredientes) {
		ControladorRecetas.recetasConIngredientes = recetasConIngredientes;
	}
}
