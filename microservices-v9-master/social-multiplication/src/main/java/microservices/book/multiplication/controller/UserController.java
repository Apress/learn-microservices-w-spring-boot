package microservices.book.multiplication.controller;

import microservices.book.multiplication.domain.User;
import microservices.book.multiplication.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author moises.macero
 */
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable("userId") final Long userId){
        return userRepository.findOne(userId);
    }
}
