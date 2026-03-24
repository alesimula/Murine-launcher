package android.processor.immutability;

public @interface Immutable {

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD})
    public static @interface Ignore {
        public java.lang.String reason() default "";
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD})
    public static @interface Policy {
        public android.processor.immutability.Immutable.Policy.Exception[] exceptions() default {};

        public static enum Exception {
            FINAL_CLASSES_WITH_FINAL_FIELDS;
        }
    }
}
