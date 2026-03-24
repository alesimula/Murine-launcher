package com.android.internal.telephony.uicc.euicc.async;

public abstract class AsyncResultCallback<Result extends java.lang.Object> {
    public AsyncResultCallback() {}
    public abstract void onResult(Result p0);
    public void onException(java.lang.Throwable p0) {}
}
