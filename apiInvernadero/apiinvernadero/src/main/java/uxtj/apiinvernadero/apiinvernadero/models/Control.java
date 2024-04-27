package uxtj.apiinvernadero.apiinvernadero.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name = "tbb_controls")
public class Control {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_control;

    private String date;
    private String time;
    private float humidity;
    private float temperature;
    private boolean ventilation;
}
