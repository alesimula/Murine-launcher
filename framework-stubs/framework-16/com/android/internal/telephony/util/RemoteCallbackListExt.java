package com.android.internal.telephony.util;

public class RemoteCallbackListExt<E extends android.os.IInterface> extends android.os.RemoteCallbackList<E> {
    public RemoteCallbackListExt() { super(); }
    public void broadcastAction(java.util.function.Consumer<E> p0) {}
}
