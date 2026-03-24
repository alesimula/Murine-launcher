package org.apache.http.params;

@java.lang.Deprecated
public interface HttpParams {
    public java.lang.Object getParameter(java.lang.String p0);
    public org.apache.http.params.HttpParams setParameter(java.lang.String p0, java.lang.Object p1);
    public org.apache.http.params.HttpParams copy();
    public boolean removeParameter(java.lang.String p0);
    public long getLongParameter(java.lang.String p0, long p1);
    public org.apache.http.params.HttpParams setLongParameter(java.lang.String p0, long p1);
    public int getIntParameter(java.lang.String p0, int p1);
    public org.apache.http.params.HttpParams setIntParameter(java.lang.String p0, int p1);
    public double getDoubleParameter(java.lang.String p0, double p1);
    public org.apache.http.params.HttpParams setDoubleParameter(java.lang.String p0, double p1);
    public boolean getBooleanParameter(java.lang.String p0, boolean p1);
    public org.apache.http.params.HttpParams setBooleanParameter(java.lang.String p0, boolean p1);
    public boolean isParameterTrue(java.lang.String p0);
    public boolean isParameterFalse(java.lang.String p0);
}
