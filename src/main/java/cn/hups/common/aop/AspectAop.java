package cn.hups.common.aop;

import cn.hups.common.po.PagePoJo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.poi.ss.formula.functions.T;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 对分页查询Service进行切面查询
 */
//把当前类作为切面类
@Aspect
@Component
public class AspectAop {
    /**
     * 对所有分页查询Mapper进行切面
     */
    //指定切入点表达式
    @Pointcut("execution(* cn.hups.*.dao.*MapperExpand.selectAll*AsPage(..))")
    public void pageHelper(){}

    /**
     * 可以在执行方法之前和之后改变参数和返回值
     * @param joinPoint 用于获取目标方法相关信息的参数
     * @return 最终的返回值
     * @throws Throwable
     */
    //把当前方法看成是环绕通知
    @Around("pageHelper()")
    public Object processTx(ProceedingJoinPoint joinPoint) throws Throwable {
        Object rvt = joinPoint.proceed();
        if (rvt instanceof List) {
            PageInfo<T> personPageInfo = new PageInfo<>((List<T>)rvt);
            rvt = personPageInfo.getList();
        }
        return rvt;
    }

    /**
     * 可以在执行方法之前对目标方法的参数进行判断
     * 通过抛出一个异常来阻断目标方法的访问
     * @param joinPoint
     */
    //把当前方法看成是前置通知
    @Before("pageHelper()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();
        for (Object argOne : args) {
            if (argOne instanceof PagePoJo) {
                PagePoJo pagePoJo = (PagePoJo)argOne;
                PageHelper.startPage(pagePoJo.getPage(), pagePoJo.getLimit());
            }
        }
        System.out.println("11111111111111111111111");
    }

    /**
     * 与After的区别在于AfterReturning只有在方法执行成功的之后才会被织入，如果After和
     * AfterReturning同时存在于一个文件中，谁写在前面谁先运行
     * @param joinPoint
     * @param ret 方法返回值
     */
    //把当前方法看做是后置通知
    @AfterReturning(returning = "ret", pointcut = "pageHelper()")
    public void doAfterReturning(JoinPoint joinPoint, Object ret) throws Throwable {
    }

}
