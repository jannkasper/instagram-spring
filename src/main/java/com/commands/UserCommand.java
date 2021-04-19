package com.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class UserCommand {
    private String id;
    private String userImageUrl;
    private String username;
    private List<Node__PostCommand> postArray;
}
