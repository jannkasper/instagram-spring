package com.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class MutualFollowCommand {

    private Integer count;
    private List<String> username;

}
