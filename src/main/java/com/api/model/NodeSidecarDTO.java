package com.api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class NodeSidecarDTO {
    private String id;
    private String shortcode;
    private Boolean isVideo;
    private List<DisplayResourceDTO> resourceArray = null;
}
