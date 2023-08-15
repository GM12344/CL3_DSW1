package com.examen3.dsw1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.examen3.dsw1.business.ProductoService;
import com.examen3.dsw1.model.Producto;

@Controller
public class ProductoController {
@Autowired	
private ProductoService service;
@GetMapping("/")

public String listadoProductos(Model model) {
model.addAttribute("listaProductos", service.listarProducto());
return "index";

	}

@GetMapping("/nuevoProducto")
public String registroProductoFormulario(Model model) {
Producto producto = new Producto();
model.addAttribute("producto", producto);
return "registroProducto";

	}
@PostMapping("/guardarProducto")
public String registroProducto(@ModelAttribute("producto") Producto producto) {
service.registrarProducto(producto);
return "redirect:/";
	}
		
@GetMapping("/actualizaProducto/{id}")
public String ActualizaProductoFormulario(@PathVariable(value ="id")int id, Model model) {
Producto producto = service.listaProductoPorId(id);
model.addAttribute("producto",producto);
return  "actualizaProducto"; 
}
		
@GetMapping("/eliminarProducto/{id}")

public String eliminaProducto(@PathVariable(value="id")int id) {
service.eliminarProducto(id);
return "redirect:/";
		}
}
