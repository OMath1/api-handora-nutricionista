package br.com.zup.edu.nutricionistas.api.dto;

import br.com.zup.edu.nutricionistas.domain.model.Nutricionista;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@AllArgsConstructor
public class NutricionistaRequest {
    @NotBlank(message = "CRM é obrigatório")
    private String crn;

    @NotBlank(message = "Nome é obrigatório")
    private String nome;

    @NotBlank(message = "CPF é obrigatório")
    @CPF
    private String cpf;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @CreatedDate
    private Date dataNascimento;

    @NotBlank(message = "E-mail é obrigatório")
    @Email
    private String email;

    public Nutricionista converter() {
        return new Nutricionista(crn, nome, cpf, dataNascimento, email);
    }

    public NutricionistaRequest(Nutricionista nutricionista) {
        this.crn = nutricionista.getCrn();
        this.nome = nutricionista.getNome();
        this.cpf = nutricionista.getCpf();
        this.dataNascimento = nutricionista.getDataDeNascimento();
        this.email = nutricionista.getEmail();
    }
}
