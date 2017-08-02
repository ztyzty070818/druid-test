package io.sugo.filter;

import java.util.List;

/**
 * Created by qwe on 17-7-28.
 */
public class NotFilter implements Filter {
    private String type = "not";
    private Filter field;

    public NotFilter(Filter field) {
        this.field = field;
    }
}
