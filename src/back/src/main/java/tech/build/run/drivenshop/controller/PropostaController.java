package tech.build.run.drivenshop.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.build.run.drivenshop.entity.Proposta;
import tech.build.run.drivenshop.service.PropostaService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@CrossOrigin(origins = "http://127.0.0.1:5501")
@RestController
@RequestMapping("/api/proposta")
public class PropostaController {
    
    private PropostaService propostaService;

    public PropostaController(PropostaService propostaService) {
        this.propostaService = propostaService;
    }

    @PostMapping
    public ResponseEntity<Void> createProposta(@RequestBody PropostaDto propostaDto) {
        var id = propostaService.createProposta(propostaDto);
        return ResponseEntity.created(URI.create("/api/proposta/" + id)).build();
    }

    @GetMapping
    public List<Proposta> getPropostas() {
        return propostaService.getPropostas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Proposta> getProposta(@PathVariable String id) {
        return propostaService.getProposta(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Proposta> updateProposta(@PathVariable String id, @RequestBody PropostaDto propostaDto) {
        return ResponseEntity.ok(propostaService.updateProposta(id, propostaDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProposta(@PathVariable String id) {
        propostaService.deleteProposta(id);
        return ResponseEntity.noContent().build();
    }
}
