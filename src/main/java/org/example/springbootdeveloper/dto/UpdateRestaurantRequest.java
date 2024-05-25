package org.example.springbootdeveloper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UpdateRestaurantRequest {
    private Long RID;
    private String rname;
    private String address;
    private String pnumber;
    private String opentime;
    private String closetime;
}
