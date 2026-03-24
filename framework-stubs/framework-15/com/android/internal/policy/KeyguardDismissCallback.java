package com.android.internal.policy;

public class KeyguardDismissCallback extends com.android.internal.policy.IKeyguardDismissCallback.Stub {
    public KeyguardDismissCallback() { super(); }
    public void onDismissError() throws android.os.RemoteException {}
    public void onDismissSucceeded() throws android.os.RemoteException {}
    public void onDismissCancelled() throws android.os.RemoteException {}
}
