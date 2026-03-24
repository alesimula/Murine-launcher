package android.webkit;

public abstract class SafeBrowsingResponse {
    @java.lang.Deprecated
    public SafeBrowsingResponse() {}
    public abstract void showInterstitial(boolean p0);
    public abstract void proceed(boolean p0);
    public abstract void backToSafety(boolean p0);
}
