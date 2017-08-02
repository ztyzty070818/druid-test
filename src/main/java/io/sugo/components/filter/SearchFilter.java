package io.sugo.components.filter;

/**
 * Created by qwe on 17-7-28.
 */
public class SearchFilter implements Filter {
    private String type = "search";
    private String dimension;
    private SearchQuery query;

    public SearchFilter(String dimension, SearchQuery query) {
        this.dimension = dimension;
        this.query = query;
    }

    private class SearchQuery {

    }

}
