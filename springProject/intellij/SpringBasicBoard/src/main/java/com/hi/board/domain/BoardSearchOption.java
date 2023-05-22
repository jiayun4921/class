package com.hi.board.domain;

import lombok.*;
import sun.java2d.pipe.SpanClipRenderer;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class BoardSearchOption {

    private String searchType;
    private String keyword;


}
