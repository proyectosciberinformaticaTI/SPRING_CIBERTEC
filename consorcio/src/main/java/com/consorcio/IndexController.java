package com.consorcio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.consorcio.entidad.Cliente;
import com.consorcio.service.ClienteDAO;

@Controller
public class IndexController {
	@Autowired
	private ClienteDAO clienteDAO; 
	
	@RequestMapping(value="/")
	public String index(Model model) {
		model.addAttribute("listCliente", clienteDAO.listAllCliente());
		return "listado";
	}
	@RequestMapping(value="/nuevoCliente")
	public String nuevoCliente() {
		return "nuevo";
	}
	@RequestMapping(value="/addCliente")
	public String addCliente(@ModelAttribute("cli") Cliente c) {
		clienteDAO.addCliente(c);
		return "redirect:/";
	}
	@RequestMapping(value="/deleteCliente/{id}")
	public String deleteCliente(@PathVariable("id") long id) {
		clienteDAO.deleteCliente(id);
		return "redirect:/";
	}
	 @RequestMapping("/editCliente/{id}")
	 public String editCliente(@PathVariable("id") int id, Model model){
	        model.addAttribute("cliente", clienteDAO.findCliente(id));
	        return "editar";
	 }
	 @RequestMapping(value="/saveCliente")
		public String saveCliente(@ModelAttribute("cli") Cliente c) {
		 	Cliente cli=clienteDAO.findCliente(c.getCodCliente());
		 	cli.setNomCliente(c.getNomCliente());
		 	cli.setApeCliente(c.getApeCliente());
		 	cli.setCreditoCliente(c.getCreditoCliente());
			clienteDAO.addCliente(cli);
			return "redirect:/";
		}
}
