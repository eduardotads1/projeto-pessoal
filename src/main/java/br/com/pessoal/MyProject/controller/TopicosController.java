package br.com.pessoal.MyProject.controller;

import br.com.pessoal.MyProject.controller.dto.TopicosDto;
import br.com.pessoal.MyProject.modelo.Curso;
import br.com.pessoal.MyProject.modelo.Topico;
import br.com.pessoal.MyProject.repository.TopicosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @Autowired
    TopicosRepository topicosRepository;

    @RequestMapping("/topicos")
    public List<TopicosDto> lista(String nomeCurso){
        if(nomeCurso != null){
            List<Topico> topicos = topicosRepository.findByCursoNome(nomeCurso);
            return TopicosDto.converter(topicos);
        }else{
            List<Topico> topicos = topicosRepository.findAll();
            return TopicosDto.converter(topicos);
        }

    }
}

