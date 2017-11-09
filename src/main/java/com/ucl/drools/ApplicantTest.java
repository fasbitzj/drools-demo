package com.ucl.drools;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.StatelessKieSession;

/**
 * Created by jiang.zheng on 2017/11/9.
 */
public class ApplicantTest {

    public static void main(String[] args) {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kContainer = kieServices.getKieClasspathContainer();
        StatelessKieSession kSession = kContainer.newStatelessKieSession();
        Applicant applicant = new Applicant("Mr John Smith", 16);
//        assertTrue(applicant.isValid());
        System.out.println(applicant.isValid());
        kSession.execute( applicant );
//        assertFalse( applicant.isValid() );
        System.out.println(applicant.isValid());
    }
}
