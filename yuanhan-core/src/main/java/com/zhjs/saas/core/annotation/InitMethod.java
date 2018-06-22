package com.yuanhan.yuanhan.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * @author:		yuanhan
 * @since:		2017-05-18
 * @modified:	2017-05-18
 * @version:	
 */

@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface InitMethod {

}
