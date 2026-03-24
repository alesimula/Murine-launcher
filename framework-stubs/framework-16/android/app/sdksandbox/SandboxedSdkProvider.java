package android.app.sdksandbox;

public abstract class SandboxedSdkProvider {
    public SandboxedSdkProvider() {}
    public final void attachContext(android.content.Context p0) {}
    public void beforeUnloadSdk() {}
    @android.annotation.Nullable
    public final android.content.Context getContext() { return null; }
    @java.lang.Deprecated
    @android.annotation.NonNull
    public abstract android.view.View getView(android.content.Context p0, android.os.Bundle p1, int p2, int p3);
    @android.annotation.NonNull
    public abstract android.app.sdksandbox.SandboxedSdk onLoadSdk(android.os.Bundle p0) throws android.app.sdksandbox.LoadSdkException;
}
