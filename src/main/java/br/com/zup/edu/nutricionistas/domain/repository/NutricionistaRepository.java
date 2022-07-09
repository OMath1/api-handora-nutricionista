package br.com.zup.edu.nutricionistas.domain.repository;

import br.com.zup.edu.nutricionistas.domain.model.Nutricionista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NutricionistaRepository extends JpaRepository<Nutricionista,Long> {
}
