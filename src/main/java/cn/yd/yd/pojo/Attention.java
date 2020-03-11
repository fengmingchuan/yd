package cn.yd.yd.pojo;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "attention")
public class Attention  {
    @Id
    private Long attention_id;

    private Long user_oneselfid;

    private Long user_othersid;



}