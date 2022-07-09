package br.com.zup.edu.nutricionistas.domain.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Getter
@Entity
@RequiredArgsConstructor
public class Nutricionista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @Column(nullable = false)
    private String crn;

    @NonNull
    @Column(nullable = false)
    private String nome;

    @NonNull
    @Column(nullable = false)
    private String cpf;

    @NonNull
    @Column(nullable = false)
    private Date dataDeNascimento;

    @NonNull
    @Column(nullable = false)
    private String email;

    @Deprecated
    public Nutricionista() {
    }

//    public Nutricionista(String crn, String nome, String cpf, Date dataNascimento, String email) {
//    }

    public Long getId() {
        return id;
    }
}
