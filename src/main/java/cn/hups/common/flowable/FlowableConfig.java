package cn.hups.common.flowable;

import cn.hups.flowproccess.utils.HupDefaultProcessDiagramGenerator;
import org.flowable.spring.SpringProcessEngineConfiguration;
import org.flowable.spring.boot.EngineConfigurationConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * flowable配置
 * 为防止生成的流程图中中文乱码
 */
@Configuration
public class FlowableConfig implements EngineConfigurationConfigurer<SpringProcessEngineConfiguration> {

    /**
     * 配置流程图片字体格式
     * @param engineConfiguration
     */
    @Override
    public void configure(SpringProcessEngineConfiguration engineConfiguration) {
        engineConfiguration.setActivityFontName("宋体");
        engineConfiguration.setLabelFontName("宋体");
        engineConfiguration.setAnnotationFontName("宋体");
//        engineConfiguration.setProcessDiagramGenerator(hupDefaultProcessDiagramGenerator());
        // 生成流程图联系BUG修复
//        engineConfiguration.setDrawSequenceFlowNameWithNoLabelDI(true);
    }

    /**
     * 自定义流程图片生成类
     * @return
     */
    @Bean
    public HupDefaultProcessDiagramGenerator hupDefaultProcessDiagramGenerator() {
        HupDefaultProcessDiagramGenerator hupDefaultProcessDiagramGenerator = new HupDefaultProcessDiagramGenerator();
        return hupDefaultProcessDiagramGenerator;
    }
}
