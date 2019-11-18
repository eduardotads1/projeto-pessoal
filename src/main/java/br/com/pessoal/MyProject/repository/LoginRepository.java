package br.com.pessoal.MyProject.repository;

import br.com.pessoal.MyProject.modelo.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Login, Long> {
    
}
