package android.os.vibrator.persistence;

@android.annotation.SuppressLint("UnflaggedApi")
public final class VibrationXmlSerializer {
    public static final int FLAG_ALLOW_HIDDEN_APIS = 1;
    public static final int FLAG_PRETTY_PRINT = 2;
    public static void serialize(android.os.VibrationEffect p0, java.io.Writer p1) throws android.os.vibrator.persistence.VibrationXmlSerializer.SerializationFailedException, java.io.IOException {}
    public static void serialize(android.os.VibrationEffect p0, java.io.Writer p1, int p2) throws android.os.vibrator.persistence.VibrationXmlSerializer.SerializationFailedException, java.io.IOException {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Flags {
    }

    public static final class SerializationFailedException extends java.lang.RuntimeException {
        SerializationFailedException(android.os.VibrationEffect p0, java.lang.Throwable p1) { super(); }
    }
}
