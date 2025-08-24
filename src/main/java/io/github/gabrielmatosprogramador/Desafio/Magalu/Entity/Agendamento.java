package io.github.gabrielmatosprogramador.Desafio.Magalu.Entity;

import io.github.gabrielmatosprogramador.Desafio.Magalu.ENUMS.canalComunicacao;
import io.github.gabrielmatosprogramador.Desafio.Magalu.ENUMS.statusAgendamento;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private String destinatario;

    @Column(nullable = false)
    private String mensagem;

    @Column(nullable = false)
    private canalComunicacao comunicacao;

    @Column
    private statusAgendamento status;

    @Column
    private LocalDateTime dataHoraCriacao;

}
