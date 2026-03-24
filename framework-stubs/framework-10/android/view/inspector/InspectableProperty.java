package android.view.inspector;

@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
public @interface InspectableProperty {
    public java.lang.String name() default "";
    public int attributeId() default 0;
    public boolean hasAttributeId() default true;
    public android.view.inspector.InspectableProperty.ValueType valueType() default android.view.inspector.InspectableProperty.ValueType.INFERRED;
    public android.view.inspector.InspectableProperty.EnumEntry[] enumMapping() default {};
    public android.view.inspector.InspectableProperty.FlagEntry[] flagMapping() default {};

    public static enum ValueType {
        NONE,
        INFERRED,
        INT_ENUM,
        INT_FLAG,
        COLOR,
        GRAVITY,
        RESOURCE_ID;
        private ValueType() {}
    }

    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FlagEntry {
        public java.lang.String name();
        public int target();
        public int mask() default 0;
    }

    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EnumEntry {
        public java.lang.String name();
        public int value();
    }
}
