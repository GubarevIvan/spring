package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "model")
    private String model;

    @Column(name = "series")
    private int series;
}
