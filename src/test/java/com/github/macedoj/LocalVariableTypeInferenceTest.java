package com.github.macedoj;

/*
  The MIT License

  Copyright 2018, Juliano Macedo.
  See LICENSE file for details.
 */


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <p>
 *JUnit test for the class {@link LocalVariableTypeInference}.
 * </p>
 *
 * @author Juliano Macedo < @macedoj at GitHub >
 * @version 0.2
 */
class LocalVariableTypeInferenceTest {

    private LocalVariableTypeInference variableTypeInference;

    @BeforeEach
    void setUp() {
        variableTypeInference = new LocalVariableTypeInference();
    }

    @Test
    void localVariableTypeInferenceArrayList() {

        var optional = variableTypeInference.localVariableTypeInferenceArrayList();
        var someObject = optional.isPresent() ? optional.get() : Optional.empty();

        assertAll("localVariableTypeInferenceArrayList",
                () -> assertTrue(someObject instanceof ArrayList),
                () -> assertNotEquals(someObject, null)
        );
    }

    @Test
    void localVariableTypeInferenceHashMap() {
        var optional = variableTypeInference.localVariableTypeInferenceHashMap();
        var someObject = optional.isPresent() ? optional.get() : Optional.empty();

        assertAll("localVariableTypeInferenceHashMap",
                () -> assertTrue(someObject instanceof HashMap),
                () -> assertNotEquals(someObject, null)
        );

    }

    @Test
    void localVariableTypeInferenceStringBuilder() {
        var optional = variableTypeInference.localVariableTypeInferenceStringBuilder();
        var someObject = optional.isPresent() ? optional.get() : Optional.empty();

        assertAll("localVariableTypeInferenceStringBuilder",
                () -> assertTrue(someObject instanceof StringBuilder),
                () -> assertNotEquals(someObject, null)
        );
    }

    @Test
    void localVariableTypeInferenceInt() {
        var optional = variableTypeInference.localVariableTypeInferenceInteger();
        var someObject = optional.isPresent() ? optional.get() : Optional.empty();

        assertAll("localVariableTypeInferenceInteger",
                () -> assertTrue(someObject instanceof Integer),
                () -> assertNotEquals(someObject, null)
        );

    }
}