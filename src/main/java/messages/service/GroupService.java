package messages.service;

import messages.entity.GroupEntity;
import messages.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroupService {
    @Autowired
    GroupRepository groupRepository;

    public List<GroupEntity> getAllGroups(){
        return groupRepository.findAll();
    }

    public Optional<GroupEntity> getById(Integer id){
        return groupRepository.findById(id);
    }

    public void save(GroupEntity group){
        groupRepository.save(group);
    }

    public void update(Integer id, GroupEntity group){
        GroupEntity newGroup = groupRepository.getById(id);
        newGroup.setName(group.getName());

        groupRepository.save(newGroup);
    }

    public void delete(Integer id){
        groupRepository.deleteById(id);
    }
}
