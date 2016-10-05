package br.com.pliniocanto.estudos.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.pliniocanto.estudos.spring.model.Produto;
import br.com.pliniocanto.estudos.spring.repository.ProdutoRepository;

@Controller
public class IndexController {

	@Autowired
	private ProdutoRepository repo;

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/produtos")
	public String listaProdutos(Model model) {

		Iterable<Produto> produtos = repo.findAll();
		model.addAttribute("produtos", produtos);

		return "listaprodutos";
	}

}
