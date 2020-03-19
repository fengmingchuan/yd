package cn.yd.yd.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



import java.util.Date;

@Getter
@Setter
@NoArgsConstructor

public class Collect {

    private Long collect_id;

    private Long message_id;

    private Long user_id;

    private Date collect_date;

}