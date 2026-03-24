package android.app.contextualsearch;

@android.annotation.SystemApi
public final class CallbackToken implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.contextualsearch.CallbackToken> CREATOR = null;
    public CallbackToken() {}
    public void getContextualSearchState(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<android.app.contextualsearch.ContextualSearchState, java.lang.Throwable> p1) {}
    public android.os.IBinder getToken() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    private static class CallbackWrapper extends android.app.contextualsearch.IContextualSearchCallback.Stub {
        CallbackWrapper(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<android.app.contextualsearch.ContextualSearchState, java.lang.Throwable> p1) { super(); }
        public void onResult(android.app.contextualsearch.ContextualSearchState p0) {}
        public void onError(android.os.ParcelableException p0) {}
    }
}
