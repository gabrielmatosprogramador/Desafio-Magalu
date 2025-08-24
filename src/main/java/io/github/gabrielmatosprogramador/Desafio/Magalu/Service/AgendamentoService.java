package io.github.gabrielmatosprogramador.Desafio.Magalu.Service;

import io.github.gabrielmatosprogramador.Desafio.Magalu.DTO.AgendamentoRequestDTO;
import io.github.gabrielmatosprogramador.Desafio.Magalu.DTO.AgendamentoResponseDTO;
import io.github.gabrielmatosprogramador.Desafio.Magalu.Entity.Agendamento;
import io.github.gabrielmatosprogramador.Desafio.Magalu.Repository.AgendamentoRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AgendamentoService {

    private final AgendamentoRepository agendamentoRepository;

    public AgendamentoService(AgendamentoRepository agendamentoRepository) {
        this.agendamentoRepository = agendamentoRepository;
    }

    public AgendamentoResponseDTO agendar (AgendamentoRequestDTO agendamentoRequestDTO){
        Agendamento agendamento = Agendamento.builder()
                .destinatario(agendamentoRequestDTO.destinatario())
                .mensagem(agendamentoRequestDTO.mensagem())
                .comunicacao(agendamentoRequestDTO.canalComunicacao())
                .status(agendamentoRequestDTO.status())
                .dataHoraEnvio(agendamentoRequestDTO.dataHoraEnvio())
                .criadoEm(LocalDateTime.now())
                .build();
        return toResponse(agendamentoRepository.save(agendamento));
    }

    public AgendamentoResponseDTO buscarPorId(Long id){
        Agendamento agendamento = agendamentoRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Nenhum agendamento encontrado com o ID definido"));
        return toResponse(agendamento);
    }

    public void deletarPorId(Long id){
        if(!agendamentoRepository.existsById(id)){
            throw new EntityNotFoundException("Nenhum agendamento encontrado com o ID definido");
        }
        agendamentoRepository.deleteById(id);
    }

    public AgendamentoResponseDTO toResponse (Agendamento agendamento){
        return new AgendamentoResponseDTO(
                agendamento.getId(),
                agendamento.getDestinatario(),
                agendamento.getMensagem(),
                agendamento.getComunicacao(),
                agendamento.getDataHoraEnvio(),
                agendamento.getStatus(),
                agendamento.getCriadoEm()
        );
    }
}
