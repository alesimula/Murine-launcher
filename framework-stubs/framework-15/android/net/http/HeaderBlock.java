package android.net.http;

public abstract class HeaderBlock {
    public HeaderBlock() {}
    @android.annotation.NonNull
    public abstract java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> getAsList();
    @android.annotation.NonNull
    public abstract java.util.Map<java.lang.String, java.util.List<java.lang.String>> getAsMap();
}
