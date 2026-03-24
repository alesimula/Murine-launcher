package android.media;

public @interface MediaResourceType {
    public static final int kUnspecified = 0;
    public static final int kSecureCodec = 1;
    public static final int kNonSecureCodec = 2;
    public static final int kGraphicMemory = 3;
    public static final int kCpuBoost = 4;
    public static final int kBattery = 5;
    public static final int kDrmSession = 6;
}
