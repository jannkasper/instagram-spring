package com.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Page_infoCommand {
    private Boolean hasNextPage;
    private String endCursor;
}
