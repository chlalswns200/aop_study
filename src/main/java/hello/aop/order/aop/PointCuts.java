package hello.aop.order.aop;

import org.aspectj.lang.annotation.Pointcut;

public class PointCuts {

    @Pointcut("execution(* hello.aop.order..*(..))")
    public void allOrder() {
    }

    @Pointcut("execution(* *..*Service.*(..))")
    private void allService() {
    }

    @Pointcut("allOrder() && allService()")
    public void orderAndService() {

    }
}
