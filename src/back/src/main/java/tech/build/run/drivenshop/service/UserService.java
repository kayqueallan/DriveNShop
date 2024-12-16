package tech.build.run.drivenshop.service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import tech.build.run.drivenshop.controller.CreateUserDto;
import tech.build.run.drivenshop.controller.UpdateUserDto;
import tech.build.run.drivenshop.entity.User;
import tech.build.run.drivenshop.repository.UserRepository;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public UUID createUser(CreateUserDto createUserDto) {

        var entity = new User(UUID.randomUUID(), createUserDto.nome(), createUserDto.email(), createUserDto.avatar(), createUserDto.senha(), Instant.now(), Instant.now());

        var user = userRepository.save(entity);

        return user.getId();
    }

    public Optional<User> getUser(String id) {
        return userRepository.findById(UUID.fromString(id));
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User updateUser(String id, UpdateUserDto updateUserDto) {
        var user = userRepository.findById(UUID.fromString(id)).get();
        user.setNome(updateUserDto.nome());
        user.setEmail(updateUserDto.email());
        user.setSenha(updateUserDto.senha());
        user.setUpdateTimestamp(Instant.now());
        return userRepository.save(user);
    }

    public void deleteUser(String id) {
        userRepository.deleteById(UUID.fromString(id));
    }
}
