package com.xiaoting.common.util;

public final class QueryConstants {

    public static final String QUESTIONMARK = "?";

    public static final String PAGE = "page";
    public static final String SIZE = "size";
    public static final String SORT_BY = "sortBy";
    public static final String SORT_ORDER = "sortOrder";

    /** - note: this character represents the ANY wildcard for the server side (persistence layer) */
    public static final String ANY_SERVER = "%";
    /** - note: this character represents the ANY wildcard for the client consumption of the API */
    public static final String ANY_CLIENT = "*";
    public static final String QUERY_PREFIX = QUESTIONMARK + "q=";
    public static final String SEPARATOR = ",";
    public static final String SEPARATOR_AMPER = "&";

    public static final String ID = "id"; // is constant because it's used for the controller mapping
    public static final String NAME = SearchField.name.toString();
    public static final String UUID = "uuid";

    private QueryConstants() {
        throw new AssertionError();
    }

    //

}
