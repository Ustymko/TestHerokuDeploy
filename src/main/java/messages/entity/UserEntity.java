package messages.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user", schema = "public")
public class UserEntity {
    @Id
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "username", length = 50)
    private String username;

    @Column(name = "phone_number", length = 50)
    private String phoneNumber;
}
