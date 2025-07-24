package com.david.santos.user.business.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class NumberPhoneDTO {

    private String number;
    private String ddd;
}
