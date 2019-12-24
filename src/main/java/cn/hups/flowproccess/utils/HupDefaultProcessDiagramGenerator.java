package cn.hups.flowproccess.utils;

import org.flowable.bpmn.model.BpmnModel;
import org.flowable.image.impl.DefaultProcessDiagramCanvas;
import org.flowable.image.impl.DefaultProcessDiagramGenerator;

import java.util.List;

/**
 * 自定义流程图片生成器
 */
public class HupDefaultProcessDiagramGenerator extends DefaultProcessDiagramGenerator {

    /**
     * 重写生成图片逻辑方法
     * @param bpmnModel
     * @param imageType
     * @param highLightedActivities
     * @param highLightedFlows
     * @param activityFontName
     * @param labelFontName
     * @param annotationFontName
     * @param customClassLoader
     * @param scaleFactor
     * @param drawSequenceFlowNameWithNoLabelDI
     * @return
     */
    protected DefaultProcessDiagramCanvas generateProcessDiagram(BpmnModel bpmnModel, String imageType, List<String> highLightedActivities, List<String> highLightedFlows, String activityFontName, String labelFontName, String annotationFontName, ClassLoader customClassLoader, double scaleFactor, boolean drawSequenceFlowNameWithNoLabelDI) {

        return null;
    }
}
