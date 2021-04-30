package com.api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class OwnerDTO {
    private String id;
    private String userImageUrl;
    private String username;
    private Boolean isVerified;
}
