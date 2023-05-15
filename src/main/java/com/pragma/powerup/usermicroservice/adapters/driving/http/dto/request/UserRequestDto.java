package com.pragma.powerup.usermicroservice.adapters.driving.http.dto.request;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class UserRequestDto {
    @NotBlank(message = "El nombre no puede ser nulo o vacio")
    private String name;
    @NotBlank(message = "El apellido no puede ser nulo o vacio")
    private String surname;
    @NotBlank(message = "El numero de documento no puede ser nulo o vacio")
    @Digits(integer = 15, fraction = 0 , message = "El numero de documento debe contener valores numericos")
    @Size(min = 6, max = 11)
    private String dniNumber;
    @Pattern(regexp = "^(\\d{10,11})|(\\+\\d{12,13})$", message = "el numero de celular debe contener un máximo de 13 caracteres y puede contener el símbolo +")
    private String phone;
    @NotNull(message = "La fecha no debe ser nula")
    @Past(message = "La fecha debe ser una fecha anterior a la actual")
    private LocalDate birthdate;
    @Email(message = "Debe ser una dirección de correo electrónico con un formato correcto")
    private String email;
    @Size(message = "La contraseña debe contener más de 8 caracteres", min = 8)
    private String password;

}
