package br.com.pessoal.MyProject.modelo;

import javax.persistence.*;

@Entity
public class Cadastro {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nome;
    private String email;
    private String senha;

    public String getEmail() { return email; }
    public String getNome() { return nome; }
    public String getSenha() { return senha; }
}
