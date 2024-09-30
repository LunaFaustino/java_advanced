package br.com.fiap.hellospringboot;

import org.springframework.web.bind.annotation.*;

@RestController
public class HellospringbootController {

    // Conexão tipo GET HTTP
    // http://localhost:8080/hello
    @RequestMapping("/hello")
    public String index() {return "<h1>Olá Mundo</h1>";}

    // Conexão tipo GET HTTP
    // http://localhost:8080/Luna
    @RequestMapping("/cadastro/{nome}")
    public String dizerNome(@PathVariable String nome) {return "Olá, meu nome é " + nome;}

    // Conexão tipo GET HTTP
    // http://localhost:8080/info?nome=Luna&idade=24
    @RequestMapping("/info")
    public String apresentar(@RequestParam("nome") String nome, @RequestParam("idade") int idade) {
        return "<h1>Olá pessoal, meu nome é " + nome + " e eu tenho " + idade + " anos</h1>";
    }

    // Conexão tipo POST HTTP
    // http://localhost:8080/postar no POSTMAN
    @PostMapping("/postar")
    public String postar() {return "Objeto postado com sucesso";}
}
