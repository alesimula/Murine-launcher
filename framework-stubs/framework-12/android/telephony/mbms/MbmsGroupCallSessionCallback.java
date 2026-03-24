package android.telephony.mbms;

public interface MbmsGroupCallSessionCallback {
    default public void onError(int p0, java.lang.String p1) {}
    default public void onAvailableSaisUpdated(java.util.List<java.lang.Integer> p0, java.util.List<java.util.List<java.lang.Integer>> p1) {}
    default public void onServiceInterfaceAvailable(java.lang.String p0, int p1) {}
    default public void onMiddlewareReady() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface GroupCallError {
    }
}
