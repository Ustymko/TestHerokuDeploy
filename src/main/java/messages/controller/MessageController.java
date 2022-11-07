package messages.controller;

import messages.entity.MessageEntity;
import messages.service.MessageService;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import javax.servlet.http.HttpServletResponse;

import messages.util.WriteCsvToResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/messages")
public class MessageController {

    @Autowired
    MessageService service;

    @GetMapping
    @RequestMapping(value = "/all/csv", produces = "text/csv")
    public void findMessagesCSV(HttpServletResponse response) throws IOException {

        List<MessageEntity> messages = service.getAllMessages();

        WriteCsvToResponse.writeCities(response.getWriter(), messages);
    }
    @GetMapping
    @RequestMapping(value = "/all")
    public List<MessageEntity> findMessages() {
        return service.getAllMessages();

    }

    @PostMapping
    public void saveMessage(@RequestBody MessageEntity message) {
        service.saveMessage(message);
    }

    @GetMapping
    @RequestMapping(value = "/{id}")
    public Optional<MessageEntity> getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PutMapping
    @RequestMapping(value = "/put/{id}")
    public void update(@PathVariable Integer id, @RequestBody MessageEntity message){
        service.update(id, message);
    }

    @DeleteMapping
    @RequestMapping(value = "/delete/{id}")
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }
//  @CrossOrigin
//  @PutMapping(path = "/{id}")
//  public void updateCar(@RequestBody CarEntity car, @PathVariable("id") Long id){
//    service.updateCar(id, car);
//  }
//
//  @CrossOrigin
//  @DeleteMapping(path = "/{id}")
//  public void deleteCar(@PathVariable("id") Long id){
//    service.deleteCar(id);
//  }
}
