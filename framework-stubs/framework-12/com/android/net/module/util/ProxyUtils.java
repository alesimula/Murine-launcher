package com.android.net.module.util;

public final class ProxyUtils {
    public static final int PROXY_VALID = 0;
    public static final int PROXY_HOSTNAME_EMPTY = 1;
    public static final int PROXY_HOSTNAME_INVALID = 2;
    public static final int PROXY_PORT_EMPTY = 3;
    public static final int PROXY_PORT_INVALID = 4;
    public static final int PROXY_EXCLLIST_INVALID = 5;
    private static final java.lang.String NAME_IP_REGEX = "[a-zA-Z0-9]+(\\-[a-zA-Z0-9]+)*(\\.[a-zA-Z0-9]+(\\-[a-zA-Z0-9]+)*)*";
    private static final java.util.regex.Pattern HOSTNAME_PATTERN = null;
    private static final java.lang.String HOSTNAME_REGEXP = "^$|^[a-zA-Z0-9]+(\\-[a-zA-Z0-9]+)*(\\.[a-zA-Z0-9]+(\\-[a-zA-Z0-9]+)*)*$";
    private static final java.util.regex.Pattern EXCLLIST_PATTERN = null;
    private static final java.lang.String EXCL_REGEX = "[a-zA-Z0-9*]+(\\-[a-zA-Z0-9*]+)*(\\.[a-zA-Z0-9*]+(\\-[a-zA-Z0-9*]+)*)*";
    private static final java.lang.String EXCLLIST_REGEXP = "^$|^[a-zA-Z0-9*]+(\\-[a-zA-Z0-9*]+)*(\\.[a-zA-Z0-9*]+(\\-[a-zA-Z0-9*]+)*)*(,[a-zA-Z0-9*]+(\\-[a-zA-Z0-9*]+)*(\\.[a-zA-Z0-9*]+(\\-[a-zA-Z0-9*]+)*)*)*$";
    public ProxyUtils() {}
    public static java.util.List<java.lang.String> exclusionStringAsList(java.lang.String p0) { return null; }
    public static java.lang.String exclusionListAsString(java.lang.String[] p0) { return null; }
    public static int validate(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return 0; }
}
