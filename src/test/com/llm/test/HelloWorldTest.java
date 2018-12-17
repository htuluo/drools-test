package com.llm.test;

import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * @description:
 * @author: luolm
 * @createTime： 2018/12/17
 * @version: v1.0.0
 * @history: (版本) 作者 时间 注释
 */
public class HelloWorldTest {
    @Test
    public  void testHelloWorld(){
        KieServices kieServices=KieServices.Factory.get();
        KieContainer kieContainer=kieServices.newKieClasspathContainer();
        KieSession kieSession=kieContainer.newKieSession("helloWorldSession");
        kieSession.fireAllRules();
        kieSession.dispose();
    }

}
