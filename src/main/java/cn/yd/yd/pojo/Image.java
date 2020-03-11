package cn.yd.yd.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "image")
public class Image {
    @Id
    private Long image_id;

    private Long message_id;

    private String images;

}