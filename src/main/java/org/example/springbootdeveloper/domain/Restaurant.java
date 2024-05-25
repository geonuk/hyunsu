package org.example.springbootdeveloper.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RID", updatable = false)
    private Long RID;

    @Column(name = "rname", nullable = false)
    private String rname;

    @Column(name = "pnumber", nullable = false)
    private String pnumber;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "opentime", nullable = false)
    private String opentime;

    @Column(name = "closetime", nullable = false)
    private String closetime;




    @Builder
    public Restaurant(Long RID, String rname, String pnumber, String address, String opentime, String closetime) {
        this.RID = RID;
        this.rname = rname;
        this.pnumber = pnumber;
        this.address = address;
        this.opentime = opentime;
        this.closetime = closetime;
    }
    public void update2(Long RID, String rname, String pnumber, String address, String opentime, String closetime) {
        this.RID = RID;
        this.rname = rname;
        this.pnumber = pnumber;
        this.address = address;
        this.opentime = opentime;
        this.closetime = closetime;
    }

}

