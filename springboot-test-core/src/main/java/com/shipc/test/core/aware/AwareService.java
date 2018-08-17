package com.shipc.test.core.aware;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 *                        Spring提供的Aware接口
 * BeanNameAware                  | 获得到容器中的Bean的名称
 * BeanFactoryAware               | 获取当前bean factory,这样可以调用容器的服务
 * ApplicationsContextAware*      | 当前的application context, 这样可以调用容器的服务
 * MessageSourceAware             | 获取message source,这样可以获得文本信息
 * ApplicationEventPublisherAware | 应用时间发布器，可以发布事件
 * ResourceLoaderAware            | 获得资源加载器，可以获得外部资源文件
 */

/**
 * @author ShiPC
 *
 * 2018年8月17日
 */
@Service
//实现BeanNameAware、ResourceLoaderAware接口，获得Bean名称和资源加载的服务
public class AwareService implements BeanNameAware, ResourceLoaderAware {

	private String beanName;
	private ResourceLoader loader;
	
	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.loader = resourceLoader;
	}

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}
	
	public void outputResult() {
		System.out.println("Bean的名称为：" + beanName);
		Resource resource = loader.getResource("classpath:aware.txt");
		try {
			System.out.println("ResourceLoader加载的文件内容为：" + IOUtils.toString(resource.getInputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
