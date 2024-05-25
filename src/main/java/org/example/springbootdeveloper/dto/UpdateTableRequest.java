package org.example.springbootdeveloper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.springbootdeveloper.domain.Restaurant;
import org.example.springbootdeveloper.domain.Tables;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UpdateTableRequest {
    private Restaurant restaurant;
    private Boolean status;
    private Integer seat;
    private Integer xcode;
    private Integer ycode;
}
