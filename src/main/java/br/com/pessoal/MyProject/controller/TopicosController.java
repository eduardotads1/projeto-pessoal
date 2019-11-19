package br.com.pessoal.MyProject.controller;

import br.com.pessoal.MyProject.controller.dto.TopicosDto;
import br.com.pessoal.MyProject.modelo.Curso;
import br.com.pessoal.MyProject.modelo.Topico;
import br.com.pessoal.MyProject.repository.TopicosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/topicos")
public class TopicosController {

    @Autowired
    TopicosRepository topicosRepository;

    @GetMapping()
    public List<TopicosDto> lista(@RequestParam(value="id", required = false) String titulo){
        if(titulo != null){
            List<Topico> topicos = topicosRepository.findByTitulo(titulo);
            return TopicosDto.converter(topicos);
        }else{
            List<Topico> topicos = topicosRepository.findAll();
            return TopicosDto.converter(topicos);
        }
    }

}

