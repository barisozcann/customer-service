package com.barisozcan.customerservice.model.request;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerCreateRequest {



    @Size(max = 20)
    @NotBlank
    private String name;

    @Size(max = 30)
    @Email(message = "Email is not valid")
    private String email;

    @Size(min = 4)
    @NotBlank
    @Pattern(regexp = "^\\+?[0-9]{10,}$", message = "Phone number should be valid")
    private String password;


    @Past(message = "Birth date should be in the past")
    private LocalDate birthDate;


    @NotBlank
    @Column(name = "phone_number")
    private String phoneNumber;

}
