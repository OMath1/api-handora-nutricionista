package br.com.zup.edu.nutricionistas.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ErroDeFormularioDto {
    private String campo;
    private String erro;
}