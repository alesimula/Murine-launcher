package com.android.org.conscrypt.metrics;

public enum Protocol {
    UNKNOWN_PROTO,
    SSLv3,
    TLSv1,
    TLSv1_1,
    TLSv1_2,
    TLSv1_3,
    TLS_PROTO_FAILED;
    final byte id = 0;
    public int getId() { return 0; }
    public static com.android.org.conscrypt.metrics.Protocol forName(java.lang.String p0) { return null; }
}
