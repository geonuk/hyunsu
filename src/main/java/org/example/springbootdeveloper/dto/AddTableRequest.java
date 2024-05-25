package org.example.springbootdeveloper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.springbootdeveloper.domain.Restaurant;
import org.example.springbootdeveloper.domain.Tables;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddTableRequest {
    private Restaurant restaurant;
    private Boolean status;
    private Integer seat;
    private Integer xcode;
    private Integer ycode;

    public Tables toEntity(){
        return Tables.builder()
                .restaurant(restaurant)
                .status(status)
                .seat(seat)
                .xcode(xcode)
                .ycode(ycode)
                .build();
    }
}
