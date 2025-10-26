package com.StudentManagement.Student_Management_API.Models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Map;

@Data
@AllArgsConstructor
public class ApiError {

    private LocalDateTime timestamp;
    private int status;
    private String message;
    private String path;
    private String error;
    private Map<String, String> details;

}
