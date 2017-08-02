package io.sugo.filter;

import java.util.List;

/**
 * Created by qwe on 17-7-28.
 */
public class InFilter implements Filter {
    private final String type = "in";
    private String dimension;
    private String[] values;

    public InFilter() {
        this.dimension = "province";
        this.values = "广东省,广西省".split(",");
    }

    public InFilter(String dimension,String[] values){
        this.dimension = dimension;
        this.values = values;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String[] getValues() {
        return values;
    }

    public void setValues(String[] values) {
        this.values = values;
    }
}