package com.cydeo.dto;

import com.cydeo.enums.Status;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class TaskDTO {


    private ProjectDTO project;
    private UserDTO user;
    private String taskSubject;
    private String taskDetail;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate assignedDate;
    private Status status;

}
