package cn.yd.yd.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor

public class Comment {

    private Long comment_id;

    private String comment_text;

    private Long message_id;

    private Long user_id;


}