package messages.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "group", schema = "public")
public class GroupEntity {
    @Id
    @Column(name = "group_id")
    private Integer groupId;

    @Column(name = "name", length = 50)
    private String name;

}
