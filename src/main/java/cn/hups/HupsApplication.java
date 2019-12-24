package cn.hups;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import javax.servlet.MultipartConfigElement;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@MapperScan("cn.hups.*.dao")
@ComponentScan(basePackages = {"cn.hups","org.flowable.ui.modeler", "org.flowable.ui.common"})
public class HupsApplication {

    public static void main(String[] args) {
        SpringApplication.run(HupsApplication.class, args);
    }

    /**
     * 文件上传配置
     * @return
     */
    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        //文件最大
        factory.setMaxFileSize("100MB"); //KB,MB
        /// 设置总上传数据总大小
        factory.setMaxRequestSize("10000MB");
        return factory.createMultipartConfig();
    }

}
//public class HupsApplication extends SpringBootServletInitializer {
//
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(HupsApplication.class);
//    }
//
//    public static void main(String[] args) {
//        SpringApplication.run(HupsApplication.class, args);
//    }
//
//    /**
//     * 文件上传配置
//     * @return
//     */
//    @Bean
//    public MultipartConfigElement multipartConfigElement() {
//        MultipartConfigFactory factory = new MultipartConfigFactory();
//        //文件最大
//        factory.setMaxFileSize("100MB"); //KB,MB
//        /// 设置总上传数据总大小
//        factory.setMaxRequestSize("10000MB");
//        return factory.createMultipartConfig();
//    }
//
//}