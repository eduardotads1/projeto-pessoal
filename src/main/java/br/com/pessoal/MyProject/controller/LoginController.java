package br.com.pessoal.MyProject.controller;

import br.com.pessoal.MyProject.modelo.Cadastro;
import br.com.pessoal.MyProject.modelo.Login;
import br.com.pessoal.MyProject.repository.CadastroRepository;
import br.com.pessoal.MyProject.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    public LoginRepository loginRepository;

    @Autowired
    public CadastroRepository cadastroRepository;

    @PostMapping("/cadastrar")
    public void cadastrar(@RequestBody Cadastro formulario){
        cadastroRepository.save(formulario);
    }

    @GetMapping("/acessar")
    public List<Cadastro> acessar(@RequestParam(value="id", required = false) String email){
        List<Cadastro> lista = cadastroRepository.findByEmail(email);
        return lista;
    }

}
