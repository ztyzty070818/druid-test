package io.sugo.filter;

/**
 * Created by qwe on 17-7-28.
 */
public class JavaScriptFilter implements Filter {
    private String type = "javascript";
    private String dimension = "age";
    private String function = "function(x) { return(x >= '30' && x <= '32') }";



    public JavaScriptFilter(String dimension, String function) {
        this.dimension = dimension;
        this.function = function;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

}
