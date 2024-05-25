package org.example.springbootdeveloper.dto;
import lombok.Getter;
import org.example.springbootdeveloper.domain.Restaurant;

@Getter
public class RestaurantResponse {
    private final Long RID;
    private final String rname;
    private final String pnumber;
    private final String address;
    private final String opentime;
    private final String closetime;

    public RestaurantResponse(Restaurant restaurant){
        this.RID = restaurant.getRID();
        this.rname = restaurant.getRname();
        this.pnumber = restaurant.getPnumber();
        this.address = restaurant.getAddress();
        this.opentime = restaurant.getOpentime();
        this.closetime = restaurant.getClosetime();
    }
}
