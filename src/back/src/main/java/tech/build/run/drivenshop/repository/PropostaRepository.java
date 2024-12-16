package tech.build.run.drivenshop.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tech.build.run.drivenshop.entity.Proposta;

@Repository
public interface PropostaRepository extends JpaRepository<Proposta, UUID> {
    
}
