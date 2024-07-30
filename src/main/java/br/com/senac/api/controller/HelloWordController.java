package br.com.senac.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/helloWord")
public class HelloWordController {
    Logger logger = LoggerFactory.getLogger(HelloWordController.class);

    @GetMapping("/teste")
    public ResponseEntity<String> helloWord(){
        logger.info("teste");
        return ResponseEntity.ok("Olá Mundo");
    }
}
