package com.mertdotcc.sources;

import com.mertdotcc.mappingresources.destination.StudentWithGrades;
import com.mertdotcc.mappingresources.source.Student;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(config = QuarkusMappingConfig.class, unmappedTargetPolicy = ReportingPolicy.IGNORE, unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface StudentConverter {

    @Mapping(source = "studentFirstName", target = "studentFirstName")
    @Mapping(source = "studentLastName", target = "studentLastName")
    @Mapping(source = "studentFaculty", target = "studentFaculty")
    @Mapping(source = "createdAt", target = "createdAt")
    @Mapping(source = "updatedAt", target = "updatedAt")
    @Mapping(source = "grades.gpa", target = "gpa")
    @Mapping(source = "grades.cgpa", target = "cgpa")
    @BeanMapping(ignoreByDefault = true)
    StudentWithGrades map(Student student);
}
