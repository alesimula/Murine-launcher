package android.os;

public interface WearModeManagerInternal {
    public static final java.lang.String QUICK_DOZE_REQUEST_IDENTIFIER = "quick_doze_request";
    public static final java.lang.String OFFBODY_STATE_ID = "off_body";
    public <T extends java.lang.Object> void addActiveStateChangeListener(java.lang.String p0, java.util.concurrent.Executor p1, java.util.function.Consumer<T> p2);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE_USE)
    public static @interface Identifier {
    }
}
