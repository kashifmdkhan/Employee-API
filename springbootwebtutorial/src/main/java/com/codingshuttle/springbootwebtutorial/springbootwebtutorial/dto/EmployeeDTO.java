package com.codingshuttle.springbootwebtutorial.springbootwebtutorial.dto;


import com.codingshuttle.springbootwebtutorial.springbootwebtutorial.annotations.AgeOddValidationAnnotation;
import com.codingshuttle.springbootwebtutorial.springbootwebtutorial.annotations.EmployeeRoleValidationAnnotation;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class EmployeeDTO {

    private Long id;

    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 10, message = "Number of characters in name should be in the range: [3,10]")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    private String email;

    @NotNull(message = "Age is required")
    @Max(value = 80, message = "Age of Employee can not be greater than 80")
    @Min(value = 18, message = "Age of Employee can not be less than 18")
    @AgeOddValidationAnnotation
    private Integer age;


    @NotBlank(message = "Role is required")
//    @Pattern(regexp = "^(ADMIN|USER)$", message = "Role of Employee should be USER or ADMIN")
    @EmployeeRoleValidationAnnotation
    private String role;

    @NotNull(message = "Salary of employee can not be null")
    @Positive(message = "Salary of employee must be positive")
    private Integer salary;

    @PastOrPresent(message = "Date of Joining field in employee can not be in future")
    private LocalDate dateOfJoining;

//    @JsonProperty("isActive")
    @AssertTrue(message = "Employee should be active")
    private Boolean isActive;

    public EmployeeDTO(){}
    public EmployeeDTO(Boolean isActive, LocalDate dateOfJoining, Integer age, String email, String name, Long id,String role,Integer salary) {
        this.isActive = isActive;
        this.dateOfJoining = dateOfJoining;
        this.age = age;
        this.email = email;
        this.name = name;
        this.id = id;
        this.role = role;
        this.salary = salary;
    }

}
