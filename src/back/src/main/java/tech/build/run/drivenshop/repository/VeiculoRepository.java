package tech.build.run.drivenshop.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tech.build.run.drivenshop.entity.Veiculo;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, UUID>{
    
}
