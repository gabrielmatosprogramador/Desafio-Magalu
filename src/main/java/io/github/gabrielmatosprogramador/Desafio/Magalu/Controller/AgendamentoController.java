package io.github.gabrielmatosprogramador.Desafio.Magalu.Controller;

import io.github.gabrielmatosprogramador.Desafio.Magalu.DTO.AgendamentoRequestDTO;
import io.github.gabrielmatosprogramador.Desafio.Magalu.DTO.AgendamentoResponseDTO;
import io.github.gabrielmatosprogramador.Desafio.Magalu.Service.AgendamentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/agendamentos")
@RequiredArgsConstructor
public class AgendamentoController {

    private final AgendamentoService agendamentoService;

    @PostMapping
    public ResponseEntity<AgendamentoResponseDTO> agendar (AgendamentoRequestDTO resquest){
        AgendamentoResponseDTO response = agendamentoService.agendar(resquest);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AgendamentoResponseDTO> buscarPorId(@PathVariable Long id){
        AgendamentoResponseDTO response = agendamentoService.buscarPorId(id);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public void deletarPorId (@PathVariable Long id){
        agendamentoService.deletarPorId(id);
    }
}
