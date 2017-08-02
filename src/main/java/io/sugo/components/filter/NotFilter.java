package io.sugo.components.filter;

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
