##Spring boot 理解 Bean 的删除 注入

#spring 
管理bean的对象是beanFactory  具体的是DefaultListableBeanFactory 在这个类中有一个注入Bean的方法，registerBeanDefinition ,在调用registerBeanDefinition 
需要BeanDefinition的参数，
spring提供了BeanDefinitonBuilder 可以构建一个BeanDefinitionBuilder可以构建一个BeanDefiniton 


