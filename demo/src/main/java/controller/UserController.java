package controller;


import com.example.demo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import repository.UserRepository;

@RestController
public class UserController {

//    @Autowired
//    private UserRepository userRepository;  // Assuming UserRepository extends MongoRepository<User, String>

//    @PostMapping(path = "/users")
//    public ResponseEntity<User> createUser(@RequestBody User user) {
//        User savedUser = userRepository.save(user);  // Save the user to the database
//        return ResponseEntity.ok(savedUser);  // Return the saved user
//    }

    @GetMapping(path = "/use")
    public String createUser2() {
        return "OK";
    }
}

