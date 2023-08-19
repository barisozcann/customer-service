package com.barisozcan.customerservice.model.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "customers")
@AllArgsConstructor
@NoArgsConstructor
public class CustomerEntity {
    @Id
    @Size(max=20)
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;

    @Size(max=20)
    @NotNull
    @Column(name = "name", nullable = false, updatable = false)
    private String name;

    @Size(max=30)
    @Email(message = "Email is not valid")
    @Column(name="email")
    private String email;

    @Size(min=4)
    @NotNull
    @Column(name="password")
    @Pattern(regexp = "^\\+?[0-9]{10,}$", message = "Phone number should be valid")
    private String password;


    @Past(message = "Birth date should be in the past")
    private LocalDate birthDate;



    @NotNull
    @Column(name="phone_number")
    private String phoneNumber;
}
