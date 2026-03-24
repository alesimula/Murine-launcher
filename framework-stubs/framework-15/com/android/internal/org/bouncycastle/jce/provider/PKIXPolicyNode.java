package com.android.internal.org.bouncycastle.jce.provider;

public class PKIXPolicyNode implements java.security.cert.PolicyNode {
    protected java.util.List children;
    protected int depth;
    protected java.util.Set expectedPolicies;
    protected java.security.cert.PolicyNode parent;
    protected java.util.Set policyQualifiers;
    protected java.lang.String validPolicy;
    protected boolean critical;
    public PKIXPolicyNode(java.util.List p0, int p1, java.util.Set p2, java.security.cert.PolicyNode p3, java.util.Set p4, java.lang.String p5, boolean p6) {}
    public void addChild(com.android.internal.org.bouncycastle.jce.provider.PKIXPolicyNode p0) {}
    public java.util.Iterator getChildren() { return null; }
    public int getDepth() { return 0; }
    public java.util.Set getExpectedPolicies() { return null; }
    public java.security.cert.PolicyNode getParent() { return null; }
    public java.util.Set getPolicyQualifiers() { return null; }
    public java.lang.String getValidPolicy() { return null; }
    public boolean hasChildren() { return false; }
    public boolean isCritical() { return false; }
    public void removeChild(com.android.internal.org.bouncycastle.jce.provider.PKIXPolicyNode p0) {}
    public void setCritical(boolean p0) {}
    public void setParent(com.android.internal.org.bouncycastle.jce.provider.PKIXPolicyNode p0) {}
    public java.lang.String toString() { return null; }
    public java.lang.String toString(java.lang.String p0) { return null; }
    public java.lang.Object clone() { return null; }
    public com.android.internal.org.bouncycastle.jce.provider.PKIXPolicyNode copy() { return null; }
    public void setExpectedPolicies(java.util.Set p0) {}
}
