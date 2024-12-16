package tech.build.run.drivenshop.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.build.run.drivenshop.entity.Veiculo;
import tech.build.run.drivenshop.service.VeiculoService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@CrossOrigin(origins = "http://127.0.0.1:5501")
@RestController
@RequestMapping("/api/veiculo")
public class VeiculoController {
    
        private VeiculoService veiculoService;
    
        public VeiculoController(VeiculoService veiculoService) {
            this.veiculoService = veiculoService;
        }
    
        @PostMapping
        public ResponseEntity<Void> createVeiculo(@RequestBody VeiculoDto veiculoDto) {
            var id = veiculoService.createVeiculo(veiculoDto);
            return ResponseEntity.created(URI.create("/api/veiculo/" + id)).build();
        }
    
        @GetMapping
        public List<Veiculo> getVeiculos() {
            return veiculoService.getVeiculos();
        }
    
        @GetMapping("/{id}")
        public ResponseEntity<Veiculo> getVeiculo(@PathVariable String id) {
            return veiculoService.getVeiculo(id)
                    .map(ResponseEntity::ok)
                    .orElse(ResponseEntity.notFound().build());
        }
    
        @PutMapping("/{id}")
        public ResponseEntity<Veiculo> updateVeiculo(@PathVariable String id, @RequestBody VeiculoDto veiculoDto) {
            return ResponseEntity.ok(veiculoService.updateVeiculo(id, veiculoDto));
        }

        @PutMapping("/{id}/status")
        public ResponseEntity<Veiculo> updateStatus(@PathVariable String id, @RequestBody int status) {
            return ResponseEntity.ok(veiculoService.updateStatus(id, status));
        }
    
        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deleteVeiculo(@PathVariable String id) {
            veiculoService.deleteVeiculo(id);
            return ResponseEntity.noContent().build();
        }
}
