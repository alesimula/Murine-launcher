package org.apache.http.params;

@java.lang.Deprecated
public final class HttpConnectionParams implements org.apache.http.params.CoreConnectionPNames {
    private HttpConnectionParams() {}
    public static int getSoTimeout(org.apache.http.params.HttpParams p0) { return 0; }
    public static void setSoTimeout(org.apache.http.params.HttpParams p0, int p1) {}
    public static boolean getTcpNoDelay(org.apache.http.params.HttpParams p0) { return false; }
    public static void setTcpNoDelay(org.apache.http.params.HttpParams p0, boolean p1) {}
    public static int getSocketBufferSize(org.apache.http.params.HttpParams p0) { return 0; }
    public static void setSocketBufferSize(org.apache.http.params.HttpParams p0, int p1) {}
    public static int getLinger(org.apache.http.params.HttpParams p0) { return 0; }
    public static void setLinger(org.apache.http.params.HttpParams p0, int p1) {}
    public static int getConnectionTimeout(org.apache.http.params.HttpParams p0) { return 0; }
    public static void setConnectionTimeout(org.apache.http.params.HttpParams p0, int p1) {}
    public static boolean isStaleCheckingEnabled(org.apache.http.params.HttpParams p0) { return false; }
    public static void setStaleCheckingEnabled(org.apache.http.params.HttpParams p0, boolean p1) {}
}
