package br.com.pessoal.MyProject.controller.dto;

import br.com.pessoal.MyProject.modelo.Topico;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class TopicosDto {

    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime data;

    public TopicosDto(Topico topicos){
        this.id = topicos.getId();
        this.titulo = topicos.getTitulo();
        this.mensagem = topicos.getMensagem();
        this.data = topicos.getDataCriacao();
    }

    public LocalDateTime getData() { return data; }
    public String getMensagem() { return mensagem; }
    public Long getId() { return id; }
    public String getTitulo() { return titulo; }

    public static List<TopicosDto> converter(List<Topico> topicos) {
        return topicos.stream().map(TopicosDto::new).collect(Collectors.toList());
    }
}
