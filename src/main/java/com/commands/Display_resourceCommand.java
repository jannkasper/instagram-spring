package com.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Display_resourceCommand {
    private String src;
    private Integer config_width;
    private Integer config_height;
}
