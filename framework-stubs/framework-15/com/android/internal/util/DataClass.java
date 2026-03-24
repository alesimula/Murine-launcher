package com.android.internal.util;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
@java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE)
public @interface DataClass {
    public boolean genParcelable() default false;
    public boolean genAidl() default false;
    public boolean genGetters() default true;
    public boolean genHiddenGetters() default false;
    public boolean genSetters() default false;
    public boolean genHiddenSetters() default false;
    public boolean genConstructor() default true;
    public boolean genHiddenConstructor() default false;
    public boolean genBuilder() default false;
    public boolean genHiddenBuilder() default false;
    public boolean genEqualsHashCode() default false;
    public boolean genToString() default false;
    public boolean genForEachField() default false;
    public boolean genCopyConstructor() default false;
    public boolean genHiddenCopyConstructor() default false;
    public boolean genConstDefs() default true;
    public boolean genHiddenConstDefs() default false;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE})
    public static @interface Each {
    }

    @java.lang.Deprecated
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.METHOD)
    public static @interface Generated {
        public long time();
        public java.lang.String codegenVersion();
        public java.lang.String sourceFile();
        public java.lang.String inputSignatures() default "";

        @java.lang.Deprecated
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.CONSTRUCTOR, java.lang.annotation.ElementType.TYPE})
        public static @interface Member {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.FIELD)
    public static @interface MaySetToNull {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.FIELD)
    public static @interface ParcelWith {
        public java.lang.Class<? extends com.android.internal.util.Parcelling> value();
    }

    public static interface PerIntFieldAction<THIS extends java.lang.Object> {
        public void acceptInt(THIS p0, java.lang.String p1, int p2);
    }

    public static interface PerObjectFieldAction<THIS extends java.lang.Object> {
        public void acceptObject(THIS p0, java.lang.String p1, java.lang.Object p2);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.FIELD)
    public static @interface PluralOf {
        public java.lang.String value();
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE)
    public static @interface Suppress {
        public java.lang.String[] value();
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.FIELD)
    public static @interface SuppressConstDefsGeneration {
    }
}
