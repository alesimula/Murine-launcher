package android.annotation;

@java.lang.annotation.Target(java.lang.annotation.ElementType.FIELD)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
public @interface BroadcastBehavior {
    public boolean explicitOnly() default false;
    public boolean registeredOnly() default false;
    public boolean includeBackground() default false;
    public boolean protectedBroadcast() default false;
}
