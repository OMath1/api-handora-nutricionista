package br.com.zup.edu.nutricionistas.api.controller;

import br.com.zup.edu.nutricionistas.api.dto.NutricionistaRequest;
import br.com.zup.edu.nutricionistas.domain.model.Nutricionista;
import br.com.zup.edu.nutricionistas.domain.repository.NutricionistaRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@AllArgsConstructor
@RestController
@RequestMapping("/nutricionistas")
public class CadastrarNutricionistasController {

    private final NutricionistaRepository repository;

    @PostMapping
    public ResponseEntity<NutricionistaRequest> cadastrar(@RequestBody @Valid NutricionistaRequest request, UriComponentsBuilder uriComponentsBuilder) {
        Nutricionista novoNutricionista = request.converter();

        repository.save(novoNutricionista);

        URI location = uriComponentsBuilder.path("/nutricionistas/{id}")
                .buildAndExpand(novoNutricionista.getId())
                .toUri();

        return ResponseEntity.created(location).body(new NutricionistaRequest(novoNutricionista));
    }
}
