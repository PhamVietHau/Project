package entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "price")
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int price;
    @DateTimeFormat(pattern = "YYYY-MM-DD hh:mm:ss")
    private Date timeStart;
    @DateTimeFormat(pattern = "YYYY-MM-DD hh:mm:ss")
    private Date timeEnd;

}
