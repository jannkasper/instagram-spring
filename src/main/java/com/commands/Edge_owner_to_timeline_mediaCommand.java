package com.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Edge_owner_to_timeline_mediaCommand {
    private Page_infoCommand pageInfo;
    private List<Node__PostCommand> mediaArray;

}
