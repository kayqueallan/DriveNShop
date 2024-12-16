package tech.build.run.drivenshop.service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import tech.build.run.drivenshop.controller.PropostaDto;
import tech.build.run.drivenshop.entity.Proposta;
import tech.build.run.drivenshop.repository.PropostaRepository;

@Service
public class PropostaService {
    
    private PropostaRepository propostaRepository;

    public PropostaService(PropostaRepository propostaRepository) {
        this.propostaRepository = propostaRepository;
    }

    public UUID createProposta(PropostaDto propostaDto) {

        var entity = new Proposta(UUID.randomUUID(), propostaDto.permuta(), propostaDto.valor(), propostaDto.telefone(), propostaDto.id_veiculo(), propostaDto.id_usuario(), Instant.now(), Instant.now());

        var proposta = propostaRepository.save(entity);

        return proposta.getId();
    }

    public Optional<Proposta> getProposta(String id) {
        return propostaRepository.findById(UUID.fromString(id));
    }

    public List<Proposta> getPropostas() {
        return propostaRepository.findAll();
    }

    public Proposta updateProposta(String id, PropostaDto propostaDto) {
        var proposta = propostaRepository.findById(UUID.fromString(id)).get();
        proposta.setPermuta(propostaDto.permuta());
        proposta.setValor(propostaDto.valor());
        proposta.setTelefone(propostaDto.telefone());
        proposta.setId_veiculo(propostaDto.id_veiculo());
        proposta.setId_usuario(propostaDto.id_usuario());
        proposta.setUpdateTimestamp(Instant.now());
        return propostaRepository.save(proposta);
    }

    public void deleteProposta(String id) {
        propostaRepository.deleteById(UUID.fromString(id));
    }
}
