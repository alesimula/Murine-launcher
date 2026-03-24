package com.android.internal.telephony.uicc.euicc.async;

public abstract class AsyncMessageInvocation<Request extends java.lang.Object, Response extends java.lang.Object> implements android.os.Handler.Callback {
    public AsyncMessageInvocation() {}
    public final void invoke(Request p0, com.android.internal.telephony.uicc.euicc.async.AsyncResultCallback<Response> p1, android.os.Handler p2) {}
    public boolean handleMessage(android.os.Message p0) { return false; }
    protected abstract void sendRequestMessage(Request p0, android.os.Message p1);
    protected abstract Response parseResult(android.os.AsyncResult p0) throws java.lang.Throwable;
}
