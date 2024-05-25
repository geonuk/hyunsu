package org.example.springbootdeveloper.domain;
import org.example.springbootdeveloper.domain.Restaurant;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Tables {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tnumber", updatable = false)
    private Long tnumber;

    @ManyToOne
    @JoinColumn(name = "RID", referencedColumnName = "RID")
    private Restaurant restaurant;

    @Column(name = "status", nullable = false)
    private Boolean status;

    @Column(name = "seat", nullable = false)
    private Integer seat;

    @Column(name = "xcode", nullable = false)
    private Integer xcode;

    @Column(name = "ycode", nullable = false)
    private Integer ycode;

    @Builder
    public Tables(Restaurant restaurant, Boolean status, Integer seat, Integer xcode, Integer ycode) {
        this.restaurant = restaurant;
        this.status = status;
        this.seat = seat;
        this.xcode = xcode;
        this.ycode = ycode;
    }

    public void update3(Restaurant restaurant, Boolean status, Integer seat, Integer xcode, Integer ycode) {
        this.restaurant = restaurant;
        this.status = status;
        this.seat = seat;
        this.xcode = xcode;
        this.ycode = ycode;
    }
}
