package android.os.vibrator.persistence;

@android.annotation.SuppressLint("UnflaggedApi")
public final class VibrationXmlParser {
    public static final java.lang.String APPLICATION_VIBRATION_XML_MIME_TYPE = "application/vnd.android.haptics.vibration+xml";
    public static final int FLAG_ALLOW_HIDDEN_APIS = 1;
    public static boolean isSupportedMimeType(java.lang.String p0) { return false; }
    @android.annotation.Nullable
    public static android.os.VibrationEffect parseVibrationEffect(java.io.Reader p0) throws java.io.IOException { return null; }
    @android.annotation.Nullable
    public static android.os.VibrationEffect parseVibrationEffect(java.io.Reader p0, int p1) throws java.io.IOException { return null; }
    @android.annotation.Nullable
    public static android.os.vibrator.persistence.ParsedVibration parseDocument(java.io.Reader p0) throws java.io.IOException { return null; }
    @android.annotation.Nullable
    public static android.os.vibrator.persistence.ParsedVibration parseDocument(java.io.Reader p0, int p1) throws java.io.IOException { return null; }
    @android.annotation.NonNull
    public static android.os.vibrator.persistence.ParsedVibration parseElement(com.android.modules.utils.TypedXmlPullParser p0, int p1) throws java.io.IOException, android.os.vibrator.persistence.VibrationXmlParser.VibrationXmlParserException { return null; }

    private static interface ElementParser<T extends java.lang.Object> {
        public T parse(com.android.modules.utils.TypedXmlPullParser p0, int p1) throws java.io.IOException, com.android.internal.vibrator.persistence.XmlParserException;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Flags {
    }

    public static final class VibrationXmlParserException extends java.lang.Exception {
    }
}
