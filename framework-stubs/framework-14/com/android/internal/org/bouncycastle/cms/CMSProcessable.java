package com.android.internal.org.bouncycastle.cms;

public interface CMSProcessable {
    public void write(java.io.OutputStream p0) throws java.io.IOException, com.android.internal.org.bouncycastle.cms.CMSException;
    public java.lang.Object getContent();
}
