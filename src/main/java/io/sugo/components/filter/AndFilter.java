package io.sugo.components.filter;

import java.util.List;

/**
 * Created by qwe on 17-7-28.
 */
public class AndFilter implements Filter {
    private final String type = "and";
    private List<Filter> fields;

    public AndFilter(List<Filter> fields) {
        this.fields = fields;
    }

    public List<Filter> getFields() {
        return fields;
    }


    public AndFilter() {
        Filter filter1 = new SeletorFilter("age","24");
        Filter filter2 = new SeletorFilter("province","广东省");
        fields.add(filter1);
        fields.add(filter2);
    }
}
