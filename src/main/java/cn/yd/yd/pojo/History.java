package cn.yd.yd.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor

public class History {

    private Long history_id;

    private Date history_date;

    private Long user_id;

    private Long message_id;


}