package io.github.gabrielmatosprogramador.Desafio.Magalu.Repository;
import io.github.gabrielmatosprogramador.Desafio.Magalu.Entity.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
}
