package com.api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class EdgeListCommentDTO {
    private Integer count;
    private PageInfoDTO pageInfo;
    private List<NodeCommentDTO> commentsArray = null;

}
