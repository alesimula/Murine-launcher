package android.annotation;

@java.lang.annotation.Target(java.lang.annotation.ElementType.FIELD)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
public @interface SdkConstant {
    public android.annotation.SdkConstant.SdkConstantType value();

    public static enum SdkConstantType {
        ACTIVITY_INTENT_ACTION,
        BROADCAST_INTENT_ACTION,
        SERVICE_ACTION,
        INTENT_CATEGORY,
        FEATURE;
        private SdkConstantType() {}
    }
}
