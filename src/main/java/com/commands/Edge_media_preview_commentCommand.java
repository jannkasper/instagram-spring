package com.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Edge_media_preview_commentCommand {
    private Integer count;
    private Page_infoCommand pageInfo;
    private List<Node_CommentCommand> commentsArray = null;

}
