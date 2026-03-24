package com.android.internal.telephony.cat;

class GetInkeyInputResponseData extends com.android.internal.telephony.cat.ResponseData {
    public java.lang.String mInData;
    protected static final byte GET_INKEY_YES = 1;
    protected static final byte GET_INKEY_NO = 0;
    public GetInkeyInputResponseData(java.lang.String p0, boolean p1, boolean p2) { super(); }
    public GetInkeyInputResponseData(boolean p0) { super(); }
    public void format(java.io.ByteArrayOutputStream p0) {}
}
