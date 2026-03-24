package android.speech;

public interface ModelDownloadListener {
    public void onProgress(int p0);
    public void onSuccess();
    public void onScheduled();
    public void onError(int p0);
}
