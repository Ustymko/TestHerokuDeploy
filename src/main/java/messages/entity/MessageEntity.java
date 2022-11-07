package messages.entity;

import java.sql.Timestamp;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "message")
public class MessageEntity {

  @Id
  @Column(name = "message_id")
  private Integer messageId;

  @Column(name = "message_body")
  private String messageBody;

  @Column(name = "is_ad")
  private Boolean isAdvertisement;

  @Column(name = "send_date")
  private Timestamp sendDate;

  @ManyToOne
  @JoinColumn(name = "group_id", referencedColumnName = "group_id", nullable = false)
  private GroupEntity group;

  @ManyToOne
  @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false)
  private UserEntity user;


}
