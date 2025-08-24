package io.github.gabrielmatosprogramador.Desafio.Magalu.DTO;

import io.github.gabrielmatosprogramador.Desafio.Magalu.ENUMS.canalComunicacao;
import io.github.gabrielmatosprogramador.Desafio.Magalu.ENUMS.statusAgendamento;

import java.time.LocalDateTime;

public record AgendamentoResponseDTO(
    Long id,
    String destinatario,
    String mensagem,
    canalComunicacao canalComunicacao,
    LocalDateTime dataHoraEnvio,
    statusAgendamento status,
    LocalDateTime criadoEm

) {
}
