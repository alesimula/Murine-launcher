package android.view;

@java.lang.annotation.Target(java.lang.annotation.ElementType.METHOD)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface RemotableViewMethod {
    public java.lang.String asyncImpl() default "";
}
