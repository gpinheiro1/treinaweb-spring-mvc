package br.com.treinaweb.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller //annotation para que o spring entenda que essa classe faz o papel de controller
@RequestMapping("/hello") //caminho para acessar qualquer recurso exposto pelo controller
public class HelloController {

    //tudo que sera exposto na web precisa de um requestMapping para saber como chegar ate aquele recurso
    @RequestMapping("/message") //annotation para que a action/metodo seja acessado e retornado pela url
    public String message(){
        return "hello";
    }

}
