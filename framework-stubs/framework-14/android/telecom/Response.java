package android.telecom;

public interface Response<IN extends java.lang.Object, OUT extends java.lang.Object> {
    public void onResult(IN p0, OUT... p1);
    public void onError(IN p0, int p1, java.lang.String p2);
}
