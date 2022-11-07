package messages.controller;

import messages.entity.UserEntity;
import messages.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/users")
public class UserController {
    @Autowired
    UserService service;

    @GetMapping
    @RequestMapping(value = "/all")
    public List<UserEntity> findUsers() {
        return service.getAllUsers();
    }

    @PostMapping
    public void saveMessage(@RequestBody UserEntity user){
        service.save(user);
    }

    @GetMapping
    @RequestMapping(value = "/{id}")
    public Optional<UserEntity> getById(@PathVariable Integer id){
        return service.getById(id);
    }

    @PutMapping
    @RequestMapping(value = "/put/{id}")
    public void update(@PathVariable Integer id, @RequestBody UserEntity user){
        service.update(id, user);
    }

    @DeleteMapping
    @RequestMapping(value = "/delete/{id}")
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }
}
