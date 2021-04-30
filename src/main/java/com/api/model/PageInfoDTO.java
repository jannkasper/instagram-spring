package com.api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PageInfoDTO {
    private Boolean hasNextPage;
    private String endCursor;
}
