package messages.service;

import messages.entity.UserEntity;
import messages.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<UserEntity> getAllUsers(){
        return userRepository.findAll();
    }

    public void save(UserEntity message){
        System.out.println(message.getPhoneNumber());
        userRepository.save(message);
    }

    public Optional<UserEntity> getById(Integer id){
        return userRepository.findById(id);
    }

    public void update(Integer id, UserEntity user){
        UserEntity newUser = userRepository.getById(id);
        newUser.setName(user.getName());
        newUser.setUsername(user.getUsername());
        newUser.setPhoneNumber(user.getPhoneNumber());

        userRepository.save(newUser);
    }

    public void delete(Integer id){
        userRepository.deleteById(id);
    }
}
