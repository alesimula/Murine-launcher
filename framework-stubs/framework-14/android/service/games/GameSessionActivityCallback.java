package android.service.games;

@android.annotation.SystemApi
public interface GameSessionActivityCallback {
    public void onActivityResult(int p0, android.content.Intent p1);
    default public void onActivityStartFailed(java.lang.Throwable p0) {}
}
