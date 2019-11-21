package com.diego.iniciandoSpring.rutas;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
 * Estoy pretendiendo que cuando a este servidor le llega una ruta solicitada sepa atenderla,
 * y esta es la funcion de esta clase.
 * 
 * Lo primerpo que tengo que decirle a Strinf es que esta clase es un controlador con  @Controller
 */
@Controller
public class RutasBasicas {
	/*http://localhost:9090/start/DIEGO/19*/
	@GetMapping("/start/{nombre}/{edad}") //Anotacion necesaria para que recoja las solicitudes de tipo GET
	//Vas a tener una uta /Satrt u despues vas a admitir cualquier otro valor
	///Start ya no va a existir que la estamos trransformando en /Start + otra cosa;
	public String rutaBasicaInicial(@PathVariable String nombre,
									@PathVariable Integer edad,
									Model model) {
		model.addAttribute("nombre", nombre);
		model.addAttribute("edad", edad);
		/*Queda esto rellenado y ahora nos vamos al html*/
		
		/*
		//Cunado se abre la ruta Start/loqueSea ese valor se queda guardado en la variable nombre y ya se puede utilizarlo
		System.out.println("Alguien ha llegado al server");
		System.out.println("Te llamas: " + nombre);
		System.out.print(" Esta es tu edad: " + edad);
		*/
		return "hola";//Va buscar un fichero llamado hola.html porque entiende que las vistas de comunicacion son ficheros html
	}
	
	@GetMapping("/comienzo")//Es mas general
	public String rutaCero(@RequestParam(required = false) Integer id,
							@RequestParam(required = false) String nombre) {//Diferencia entre decir que espero un parametro emdiante la ruta o mediante la peticion como en este caso.
		System.out.println("Han llegado al path inicial");
		System.out.println("id:" + id);
		System.out.println("nombre:" + nombre);

		return "prueba2";
	}
	
	@GetMapping("/rutaUno")
	public String rutaUno() {
		System.out.println("Primera ruta hecho a mano");
		return "prueba2";
	}
	
	@GetMapping("/rutaDos")
	public String rutaDos() {
		System.out.println("Segunda ruta hecha por mi cuenta");
		return "No funciona el return";
	}
	
	
	/*EJERCICIO DE CLASE SOBRE EL ULTIMO ENTIDAD RELACION */
	

}
