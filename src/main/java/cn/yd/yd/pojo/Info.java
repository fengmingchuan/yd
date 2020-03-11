package cn.yd.yd.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "info")
public class Info {
    @Id
    private Long info_id;

    private String info_text;

    private Long user_sendid;

    private Long user_rpid;

    private Date info_date;

}