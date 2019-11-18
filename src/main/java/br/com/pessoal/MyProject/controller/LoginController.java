package br.com.pessoal.MyProject.controller;

import br.com.pessoal.MyProject.modelo.Login;
import br.com.pessoal.MyProject.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("login")
public class LoginController {

    @Autowired
    public LoginRepository loginRepository;

    @PostMapping("cadastrar")
    public void cadastrar(@RequestBody Login formulario){
        loginRepository.save(formulario);
    }
}
