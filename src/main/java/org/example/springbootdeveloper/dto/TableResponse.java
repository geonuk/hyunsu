package org.example.springbootdeveloper.dto;
import lombok.Getter;
import org.example.springbootdeveloper.domain.Restaurant;
import org.example.springbootdeveloper.domain.Tables;

@Getter
public class TableResponse {
    private final Restaurant restaurant;
    private final Boolean status;
    private final Integer seat;
    private final Integer xcode;
    private final Integer ycode;

    public TableResponse(Tables table){
        this.restaurant = table.getRestaurant();
        this.status = table.getStatus();
        this.seat = table.getSeat();
        this.xcode = table.getXcode();
        this.ycode = table.getYcode();
    }
}
