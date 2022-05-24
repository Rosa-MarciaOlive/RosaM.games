package application.repositories;

import org.springframework.data.repository.CrudRepository;

import application.models.Plataforma;

public interface JogoRepository extends CrudRepository<Jogo, Integer>{
    
}
