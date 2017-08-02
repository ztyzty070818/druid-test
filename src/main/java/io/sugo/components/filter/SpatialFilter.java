package io.sugo.components.filter;

/**
 * Created by qwe on 17-7-28.
 */
public class SpatialFilter implements Filter {
    private String type = "spatial";
    private String dimension;
    private Bound bound;

    public SpatialFilter(String dimension, Bound bound) {
        this.dimension = dimension;
        this.bound = bound;
    }

    private class Bound {

    }

}