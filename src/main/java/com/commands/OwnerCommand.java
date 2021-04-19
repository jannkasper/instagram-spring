package com.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class OwnerCommand {
    private String id;
    private String userImageUrl;
    private String username;
    private Boolean isVerified;
}
