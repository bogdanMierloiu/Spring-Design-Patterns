package com.frankmoley.lil.designpatternsapp.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SimContact {

    private String name;
    private String phoneNumber;


}
