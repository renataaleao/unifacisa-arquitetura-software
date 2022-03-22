package unifacisa.arq.software.produto.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unifacisa.arq.software.produto.Produto;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	
	@GetMapping
	public ArrayList<Produto> getProduto() {
		return new ArrayList<Produto>();
	}

}
