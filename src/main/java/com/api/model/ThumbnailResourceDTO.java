package com.api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class ThumbnailResourceDTO {
    private String src;
    private Integer config_width;
    private Integer config_height;
}
