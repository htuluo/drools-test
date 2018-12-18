package com.llm.test;

import com.llm.entity.Person;
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
public class PersonTest {
    @Test
    public void personTest(){
        KieServices kieServices=KieServices.Factory.get();
        KieContainer kieClasspathContainer = kieServices.getKieClasspathContainer("ageBase");
        KieSession kieSession = kieClasspathContainer.newKieSession("ageSession");
        Person person=new Person(12,"aa");
        kieSession.insert(person);
        kieSession.fireAllRules(3);
        kieSession.dispose();

    }
}
