package com.android.internal.infra;

public abstract class AbstractSinglePendingRequestRemoteService<S extends com.android.internal.infra.AbstractSinglePendingRequestRemoteService<S, I>, I extends android.os.IInterface> extends com.android.internal.infra.AbstractRemoteService<S, I> {
    protected com.android.internal.infra.AbstractRemoteService.BasePendingRequest<S, I> mPendingRequest;
    public AbstractSinglePendingRequestRemoteService(android.content.Context p0, java.lang.String p1, android.content.ComponentName p2, int p3, com.android.internal.infra.AbstractRemoteService.VultureCallback<S> p4, android.os.Handler p5, int p6, boolean p7) { super(null, null, null, 0, null, null, 0, false); }
    void handlePendingRequests() {}
    protected void handleOnDestroy() {}
    void handleBindFailure() {}
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    void handlePendingRequestWhileUnBound(com.android.internal.infra.AbstractRemoteService.BasePendingRequest<S, I> p0) {}
}
