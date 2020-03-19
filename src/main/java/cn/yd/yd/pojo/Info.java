package cn.yd.yd.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor

public class Info {

    private Long info_id;

    private String info_text;

    private Long user_sendid;

    private Long user_rpid;

    private Date info_date;

}