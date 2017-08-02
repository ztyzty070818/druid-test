package io.sugo.components.filter;

/**
 * Created by qwe on 17-7-28.
 */
public class RegexFilter implements Filter {
    private final String type = "regex";
    private String dimension = "id";
    private String pattern = "^c2.*";

    public RegexFilter(String dimension, String pattern) {
        this.dimension = dimension;
        this.pattern = pattern;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}
