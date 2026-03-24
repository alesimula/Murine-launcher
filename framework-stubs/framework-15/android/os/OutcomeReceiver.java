package android.os;

public interface OutcomeReceiver<R extends java.lang.Object, E extends java.lang.Throwable> {
    public void onResult(R p0);
    default public void onError(E p0) {}
}
