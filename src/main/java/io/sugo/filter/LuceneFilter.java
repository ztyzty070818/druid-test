package io.sugo.filter;

/**
 * Created by qwe on 17-7-28.
 */
public class LuceneFilter implements Filter {
    private String type = "lucene";
    private String query;

    public LuceneFilter(String dimension, String query) {
        this.query = query;
    }
}
