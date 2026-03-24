package android.annotation;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR, java.lang.annotation.ElementType.PACKAGE})
public @interface UserHandleAware {
    public int enabledSinceTargetSdkVersion() default 0;
    public java.lang.String requiresPermissionIfNotCaller() default "";
    public java.lang.String[] requiresAnyOfPermissionsIfNotCaller() default {};
    public java.lang.String[] requiresAnyOfPermissionsIfNotCallerProfileGroup() default {};
    public android.annotation.SpecialUsers.SpecialUser[] specialUsersAllowed() default android.annotation.SpecialUsers.SpecialUser.DISALLOW_EVERY;
}
