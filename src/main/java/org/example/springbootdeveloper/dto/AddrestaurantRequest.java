package org.example.springbootdeveloper.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.springbootdeveloper.domain.Restaurant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddrestaurantRequest {
    private String rname;
    private String address;
    private String pnumber;
    private String opentime;
    private String closetime;

    public Restaurant toEntity(){
        return Restaurant.builder()
                .rname(rname)
                .address(address)
                .pnumber(pnumber)
                .opentime(opentime)
                .closetime(closetime)
                .build();
    }
}
