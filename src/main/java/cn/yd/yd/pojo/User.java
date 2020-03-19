package cn.yd.yd.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor

public class User {

    private Long user_id;

    private String user_name;

    private Integer user_grade;

    private String user_pwd;

    private Date user_date;

    private String user_image;

    private Integer user_integral;

    private String user_describe;

    private String user_code;


}