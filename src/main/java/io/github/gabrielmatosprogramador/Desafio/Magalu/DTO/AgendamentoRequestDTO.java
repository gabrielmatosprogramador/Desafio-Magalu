package io.github.gabrielmatosprogramador.Desafio.Magalu.DTO;

import io.github.gabrielmatosprogramador.Desafio.Magalu.ENUMS.canalComunicacao;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record AgendamentoRequestDTO(
    @NotBlank(message = "O destinatário é obrigatório!")
    String destinatario,
    @NotBlank(message = "A mensagem é obrigatória!")
    String mensagem,
    @NotBlank(message = "O Canal de Comunicação é obrigatório!")
    canalComunicacao canalComunicacao,

    @NotNull(message = "A Data e hora devem ser definidas!")
    @Future(message = "A data e hora de envio são obrigatórias!")
    LocalDateTime dataHoraEnvio
) {
}
