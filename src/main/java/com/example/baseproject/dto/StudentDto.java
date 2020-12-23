package com.example.baseproject.dto;

import com.example.baseproject.entity.Department;
import lombok.Data;

@Data
public class StudentDto {
    private long studentId;
    private String studentName;
    private int studentAge;
    private String studentGender;
    private boolean enable=true;
    private DepartmentDto departmentDto;
}
