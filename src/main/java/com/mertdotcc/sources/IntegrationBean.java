package com.mertdotcc.sources;

import com.mertdotcc.mappingresources.destination.StudentWithGrades;
import com.mertdotcc.mappingresources.source.Student;
import org.apache.camel.Exchange;
import javax.inject.Singleton;
import javax.inject.Inject;
import javax.inject.Named;
import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
@Named("IntegrationBean")
@Singleton
public class IntegrationBean {


	@Inject
	StudentConverter converter;


    public void handleMapping(Exchange exchange) {
        Student student = exchange.getIn().getBody(Student.class);

        System.out.println("\nstudent: " + student);
        StudentWithGrades studentWithGrades = converter.map(student);
        System.out.println("\nstudentWithGrades: " + studentWithGrades);

        exchange.getIn().setBody(studentWithGrades);
    }

}
