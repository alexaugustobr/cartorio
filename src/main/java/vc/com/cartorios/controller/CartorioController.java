package vc.com.cartorios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import vc.com.cartorios.service.CartorioService;
import vc.com.cartorios.to.CartorioTO;

@Controller
@RequestMapping(path = "/cartorios")
public class CartorioController {

	private static final String LISTA_CARTORIO = "ListaCartorio";
	private static final String CADASTRO_CARTORIO = "CadastroCartorio";

	@Autowired
	private CartorioService cartorioService;

	@GetMapping
	public ModelAndView listAll() {

		ModelAndView mv = new ModelAndView(LISTA_CARTORIO);
		mv.addObject("cartorios", cartorioService.listAll());
		return mv;
	}

	@GetMapping(path = "/add")
	public ModelAndView add() {

		ModelAndView mv = new ModelAndView(CADASTRO_CARTORIO);
		mv.addObject("cartorio", new CartorioTO());
		return mv;
	}

	@GetMapping("{id}")
	public ModelAndView edit(@PathVariable("id") Long id) {

		ModelAndView mv = new ModelAndView(CADASTRO_CARTORIO);
		mv.addObject("cartorio", cartorioService.findById(id));
		return mv;
	}

	@PostMapping(path = "/save")
	public String save(@Validated @ModelAttribute("cartorio") CartorioTO cartorio) {

		cartorioService.save(cartorio);
		return "redirect:/cartorios";
	}

	@RequestMapping(value = "{id}", method = RequestMethod.DELETE)
	public String delete(@PathVariable("id") Long id) {

		cartorioService.delete(id);
		return "redirect:/cartorios";
	}

}
