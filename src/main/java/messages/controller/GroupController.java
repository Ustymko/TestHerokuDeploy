package messages.controller;

import messages.entity.GroupEntity;
import messages.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/groups")
public class GroupController {
    @Autowired
    GroupService service;

    @GetMapping
    @RequestMapping(value = "/all")
    public List<GroupEntity> findGroups() {
        return service.getAllGroups();
    }

    @PostMapping
    public void saveMessage(@RequestBody GroupEntity group){
        service.save(group);
    }

    @GetMapping
    @RequestMapping(value = "/{id}")
    public Optional<GroupEntity> getById(@PathVariable Integer id){
        return service.getById(id);
    }

    @PutMapping
    @RequestMapping(value = "/put/{id}")
    public void update(@PathVariable Integer id, @RequestBody GroupEntity group){
        service.update(id, group);
    }

    @DeleteMapping
    @RequestMapping(value = "/delete/{id}")
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }
}
