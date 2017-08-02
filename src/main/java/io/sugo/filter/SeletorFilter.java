package io.sugo.filter;

/**
 * Created by qwe on 17-7-28.
 */
public class SeletorFilter implements Filter {
    private String type = "selector";
    private String dimension = "id";
    private String value = "62c237e40c008cda8c221a4d1231f790";

    public SeletorFilter(String dimension,String value) {
        this.dimension = dimension;
        this.value = value;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
