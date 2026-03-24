package com.android.internal.infra;

public abstract class AbstractMultiplePendingRequestsRemoteService<S extends com.android.internal.infra.AbstractMultiplePendingRequestsRemoteService<S, I>, I extends android.os.IInterface> extends com.android.internal.infra.AbstractRemoteService<S, I> {
    private final int mInitialCapacity = 0;
    protected java.util.ArrayList<com.android.internal.infra.AbstractRemoteService.BasePendingRequest<S, I>> mPendingRequests;
    public AbstractMultiplePendingRequestsRemoteService(android.content.Context p0, java.lang.String p1, android.content.ComponentName p2, int p3, com.android.internal.infra.AbstractRemoteService.VultureCallback<S> p4, android.os.Handler p5, int p6, boolean p7, int p8) { super(null, null, null, 0, null, null, 0, false); }
    void handlePendingRequests() {}
    protected void handleOnDestroy() {}
    final void handleBindFailure() {}
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    void handlePendingRequestWhileUnBound(com.android.internal.infra.AbstractRemoteService.BasePendingRequest<S, I> p0) {}
}
