package com.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class LocationCommand {
    private String id;
    private String name;
    private String slug;
}
