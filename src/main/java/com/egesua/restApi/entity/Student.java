package com.egesua.restApi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
        private Long id;
        private String firstName;
        private String lastName;
        private int grade;
        private boolean isSuccessful;
}
