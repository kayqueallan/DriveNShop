package tech.build.run.drivenshop.controller;

public record FeedbackDto(String comentario, int tipo_transacao, int avaliacao, String id_avaliador, String id_avaliado) {
    
}
