package ma.xproc.servicevideo.Entity;

import jakarta.persistence.*;
import lombok.*;

import javax.xml.transform.sax.SAXResult;
import java.util.Date;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String url;
    private String description;
    private Date datePublication;

    @ManyToOne()
    private Creator creator;
}
