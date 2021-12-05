package shop.dangdang.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import shop.dangdang.dto.UploadDto;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Upload extends Timestamped {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long idx;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private String image;

    public Upload(UploadDto uploadDto, String image) {
        this.content = uploadDto.getContent();
        this.image = image;

    }

}

