package android.rotationresolver;

public abstract class RotationResolverInternal {
    public RotationResolverInternal() {}
    public abstract boolean isRotationResolverSupported();
    public abstract void resolveRotation(android.rotationresolver.RotationResolverInternal.RotationResolverCallbackInternal p0, java.lang.String p1, int p2, int p3, long p4, android.os.CancellationSignal p5);

    public static interface RotationResolverCallbackInternal {
        public void onSuccess(int p0);
        public void onFailure(int p0);
    }
}
