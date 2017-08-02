package io.sugo.filter;

/**
 * Created by qwe on 17-7-28.
 */
public class BoundFilter implements Filter {
    private final String type = "bound";
    private String dimension;
    private String lower;
    private String upper;
    private boolean lowerStrict;
    private boolean upperStrict;
    private boolean alphaNumeric;

    public BoundFilter() {
        this.dimension = "age";
        this.lower = "40";
        this.upper = "42";
        this.lowerStrict = true;
        this.upperStrict = false;
        this.alphaNumeric = true;
    }

    public BoundFilter(String dimension, String lower, String upper, boolean lowerStrict, boolean upperStrict, boolean alphaNumeric) {
        this.dimension = dimension;
        this.lower = lower;
        this.upper = upper;
        this.lowerStrict = lowerStrict;
        this.upperStrict = upperStrict;
        this.alphaNumeric = alphaNumeric;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getLower() {
        return lower;
    }

    public void setLower(String lower) {
        this.lower = lower;
    }

    public String getUpper() {
        return upper;
    }

    public void setUpper(String upper) {
        this.upper = upper;
    }

    public boolean isLowerStrict() {
        return lowerStrict;
    }

    public void setLowerStrict(boolean lowerStrict) {
        this.lowerStrict = lowerStrict;
    }

    public boolean isUpperStrict() {
        return upperStrict;
    }

    public void setUpperStrict(boolean upperStrict) {
        this.upperStrict = upperStrict;
    }

    public boolean isAlphaNumeric() {
        return alphaNumeric;
    }

    public void setAlphaNumeric(boolean alphaNumeric) {
        this.alphaNumeric = alphaNumeric;
    }
}