package com.StudentManagement.Student_Management_API.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @NotNull(message = "Id number cannot be null")
    public Integer  id;
    @NotBlank(message = "Name is mandatory")
    @Size(min = 3, max = 30, message = "Name must be 3–30 characters")
    public String name;
    @NotBlank(message = "SureName is mandatory")
    @Size(min = 3, max = 30, message = "SureName must be 3–30 characters")
    public String surname;
    @NotBlank(message = "Email is mandatory")
    @Size(min = 18, max = 30, message = "Email must be 18–30 characters")
    public String email;
}
