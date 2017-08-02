package io.sugo.filter;

import java.util.List;

/**
 * Created by qwe on 17-7-28.
 */
public class LookupFilter implements Filter {
    private String type = "lookup";
    private String dimension;
    private String lookup;

    public LookupFilter(String dimension, String lookup) {
        this.dimension = dimension;
        this.lookup = lookup;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getLookup() {
        return lookup;
    }

    public void setLookup(String lookup) {
        this.lookup = lookup;
    }


}
