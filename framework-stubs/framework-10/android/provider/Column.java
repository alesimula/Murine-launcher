package android.provider;

@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@java.lang.annotation.Target(java.lang.annotation.ElementType.FIELD)
public @interface Column {
    public int value();
    public boolean readOnly() default false;
}
