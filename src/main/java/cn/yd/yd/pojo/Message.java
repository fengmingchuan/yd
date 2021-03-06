package cn.yd.yd.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.Date;

@Getter
@Setter
@NoArgsConstructor

public class Message {

    private Long message_id;

    private Long user_id;

    private String message_title;

    private Date message_date;

    private Integer message_type;

    private Integer message_like;

    private Integer message_look;

    private Integer message_transmit;

    private Integer message_collectCount;

    private String message_text;

    private   User user;

}