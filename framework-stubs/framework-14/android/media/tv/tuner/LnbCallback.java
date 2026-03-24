package android.media.tv.tuner;

@android.annotation.SystemApi
public interface LnbCallback {
    public void onEvent(int p0);
    public void onDiseqcMessage(byte[] p0);
}
