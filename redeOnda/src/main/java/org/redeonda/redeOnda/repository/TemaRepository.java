package org.redeonda.redeOnda.repository;

import java.util.List;

import org.redeonda.redeOnda.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemaRepository extends JpaRepository<Tema, Long>{

	public List <Tema> findAllByTituloContainingIgnoreCase(String titulo);

}
