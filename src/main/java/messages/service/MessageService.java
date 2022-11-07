package messages.service;

import messages.entity.MessageEntity;
import messages.repository.MessageRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
  @Autowired
  MessageRepository messageRepository;

  public List<MessageEntity> getAllMessages(){
    return messageRepository.findAll();
  }

  public void saveMessage(MessageEntity message){
    messageRepository.save(message);
  }

  public Optional<MessageEntity> getById(Integer id){
    return messageRepository.findById(id);
  }

  public void update(Integer id, MessageEntity message){
    MessageEntity newMessage = messageRepository.getById(id);
    newMessage.setMessageId(message.getMessageId());
    newMessage.setMessageBody(message.getMessageBody());
    newMessage.setSendDate(message.getSendDate());
    newMessage.setIsAdvertisement(message.getIsAdvertisement());
    newMessage.setUser(message.getUser());
    newMessage.setGroup(message.getGroup());

    messageRepository.save(newMessage);
  }

  public void delete(Integer id){
    messageRepository.deleteById(id);
  }

}
