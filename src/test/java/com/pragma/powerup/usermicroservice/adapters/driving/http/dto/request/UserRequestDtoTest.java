package com.pragma.powerup.usermicroservice.adapters.driving.http.dto.request;



import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserRequestDtoTest {
    private final String EMPTY_NAME ="";
    private final String GOOD_SURNAME = "Gil";
    private final String GOOD_DOCUMENT = "12345664";
    private final String GOOD_PHONE = "3001122211";
    private final LocalDate TODAY = LocalDate.now();
    private final String GOOD_EMAIL = "prueba@gmail.com";
    private final String PASSWORD = "1234";

    @Autowired
    private Validator validator;

    private UserRequestDto requestDto;

    @DisplayName("Valida si el campo nombre es vacío")
    @Test
    void validUserRequestDtoWithBadNameEmpty(){
        requestDto = new UserRequestDto(EMPTY_NAME,GOOD_SURNAME,GOOD_DOCUMENT,GOOD_PHONE,TODAY,GOOD_EMAIL,PASSWORD);

        Set<ConstraintViolation<UserRequestDto>> violations = validator.validate(requestDto);

        assertEquals(2, violations.size());

        for (ConstraintViolation<UserRequestDto> violation : violations) {
            System.out.println(violation.getPropertyPath() + ": " + violation.getMessage());
        }
    }
}