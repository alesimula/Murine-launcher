package android.os.vibrator.persistence;

public final class VibrationXmlSerializer {
    public static final int FLAG_ALLOW_HIDDEN_APIS = 1;
    public static final int FLAG_PRETTY_PRINT = 2;
    public static void serialize(android.os.VibrationEffect p0, java.io.Writer p1) throws java.io.IOException {}
    public static void serialize(android.os.VibrationEffect p0, java.io.Writer p1, int p2) throws java.io.IOException {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Flags {
    }

    public static final class SerializationFailedException extends java.io.IOException {
    }
}
