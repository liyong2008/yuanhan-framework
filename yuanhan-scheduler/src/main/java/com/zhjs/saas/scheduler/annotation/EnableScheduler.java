package com.yuanhan.yuanhan.scheduler.annotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.context.annotation.Import;

import com.yuanhan.yuanhan.scheduler.config.SchedulerConfig;

/**
 * 
 * @author:		yuanhan
 * @since:		2018-06-11
 * @modified:	2018-06-11
 * @version:	
 */
@Documented
@Retention(RUNTIME)
@Target({ TYPE, METHOD })
@EnableBatchProcessing
@EnableElasticJob
@Import(SchedulerConfig.class)
public @interface EnableScheduler
{

}
