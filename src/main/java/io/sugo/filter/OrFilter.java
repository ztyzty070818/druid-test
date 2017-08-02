package io.sugo.filter;

import java.util.List;

/**
 * Created by qwe on 17-7-28.
 */
public class OrFilter implements Filter {
    private String type = "or";
    private List<Filter> fields;

    public OrFilter(List<Filter> fields) {
        this.fields = fields;
    }
}
