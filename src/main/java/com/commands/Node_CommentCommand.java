package com.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Node_CommentCommand {
    private String id;
    private String text;
    private Integer createdAt;
    private OwnerCommand owner;
    private Boolean viewerHasLiked;
    private Integer likes;
}
