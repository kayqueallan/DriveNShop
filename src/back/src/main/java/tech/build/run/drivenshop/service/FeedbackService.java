package tech.build.run.drivenshop.service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import tech.build.run.drivenshop.controller.FeedbackDto;
import tech.build.run.drivenshop.entity.Feedback;
import tech.build.run.drivenshop.repository.FeedbackRepository;

@Service
public class FeedbackService {

    private FeedbackRepository feedbackRepository;

    public FeedbackService(FeedbackRepository feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }

    public UUID createFeedback(FeedbackDto feedbackDto) {

        var entity = new Feedback(UUID.randomUUID(), feedbackDto.comentario(), feedbackDto.tipo_transacao(), feedbackDto.avaliacao(), feedbackDto.id_avaliador(), feedbackDto.id_avaliado(), Instant.now(), Instant.now());

        var feedback = feedbackRepository.save(entity);

        return feedback.getId();
    }

    public Optional<Feedback> getFeedback(String id) {
        return feedbackRepository.findById(UUID.fromString(id));
    }

    public List<Feedback> getFeedbacks() {
        return feedbackRepository.findAll();
    }

    public Feedback updateFeedback(String id, FeedbackDto feedbackDto) {
        var feedback = feedbackRepository.findById(UUID.fromString(id)).get();
        feedback.setComentario(feedbackDto.comentario());
        feedback.setTipo_transacao(feedbackDto.tipo_transacao());
        feedback.setAvaliacao(feedbackDto.avaliacao());
        feedback.setId_avaliador(feedbackDto.id_avaliador());
        feedback.setId_avaliado(feedbackDto.id_avaliado());
        feedback.setUpdateTimestamp(Instant.now());
        return feedbackRepository.save(feedback);
    }

    public void deleteFeedback(String id) {
        feedbackRepository.deleteById(UUID.fromString(id));
    }

}
