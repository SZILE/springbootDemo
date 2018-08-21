package com.shipc.test.core.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ShiPC
 *
 * 2018年8月21日
 * 
 * Spring Aware
 */
/**
 * Spring的依赖注入的最大亮点就是所有的Bean对Spring容器的存在是没有意识的。即可以将你的容器换成别的容器。
 * 但是在实际项目中，那不可避免的要用到Spring容器本身的功能资源，这时你的Bean必须要意识到容器的存在，才能调
 * 用Spring所提供的资源，这就是所谓的Spring Aware。
 */
/**
 *                        Spring提供的Aware接口
 * BeanNameAware                  | 获得到容器中的Bean的名称
 * BeanFactoryAware               | 获取当前bean factory,这样可以调用容器的服务
 * ApplicationsContextAware*      | 当前的application context, 这样可以调用容器的服务
 * MessageSourceAware             | 获取message source,这样可以获得文本信息
 * ApplicationEventPublisherAware | 应用时间发布器，可以发布事件
 * ResourceLoaderAware            | 获得资源加载器，可以获得外部资源文件
 */
public class Main {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
		
		AwareService awareService = context.getBean(AwareService.class);
		awareService.outputResult();
		context.close();
	}
}
