package tech.build.run.drivenshop.service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import tech.build.run.drivenshop.controller.VeiculoDto;
import tech.build.run.drivenshop.entity.Veiculo;
import tech.build.run.drivenshop.repository.VeiculoRepository;

@Service
public class VeiculoService {

    private VeiculoRepository veiculoRepository;

    public VeiculoService(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    public UUID createVeiculo(VeiculoDto veiculoDto) {

        var entity = new Veiculo(UUID.randomUUID(), veiculoDto.ano(), veiculoDto.categoria(), veiculoDto.condicao(), veiculoDto.descricao(), veiculoDto.localizacao(), veiculoDto.marca(), veiculoDto.modelo(), veiculoDto.preco(), veiculoDto.quilometragem(), veiculoDto.tipo(), 1, veiculoDto.id_usuario(), Instant.now(), Instant.now());

        var veiculo = veiculoRepository.save(entity);

        return veiculo.getId();
    }

    public Optional<Veiculo> getVeiculo(String id) {
        return veiculoRepository.findById(UUID.fromString(id));
    }

    public List<Veiculo> getVeiculos() {
        return veiculoRepository.findAll();
    }

    public Veiculo updateVeiculo(String id, VeiculoDto veiculoDto) {
        var veiculo = veiculoRepository.findById(UUID.fromString(id)).get();
        veiculo.setAno(veiculoDto.ano());
        veiculo.setCategoria(veiculoDto.categoria());
        veiculo.setCondicao(veiculoDto.condicao());
        veiculo.setDescricao(veiculoDto.descricao());
        veiculo.setLocalizacao(veiculoDto.localizacao());
        veiculo.setMarca(veiculoDto.marca());
        veiculo.setModelo(veiculoDto.modelo());
        veiculo.setPreco(veiculoDto.preco());
        veiculo.setQuilometragem(veiculoDto.quilometragem());
        veiculo.setTipo(veiculoDto.tipo());
        veiculo.setId_usuario(veiculoDto.id_usuario());
        veiculo.setUpdateTimestamp(Instant.now());

        return veiculoRepository.save(veiculo);
    }

    public Veiculo updateStatus(String id, int status) {
        var veiculo = veiculoRepository.findById(UUID.fromString(id)).get();
        veiculo.setStatus(status);
        veiculo.setUpdateTimestamp(Instant.now());

        return veiculoRepository.save(veiculo);
    }

    public void deleteVeiculo(String id) {
        veiculoRepository.deleteById(UUID.fromString(id));
    }
}
