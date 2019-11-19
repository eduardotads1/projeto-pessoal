package br.com.pessoal.MyProject.repository;

import br.com.pessoal.MyProject.modelo.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CadastroRepository extends JpaRepository<Cadastro , Long> {
    List<Cadastro> findByEmail(String email);
}
