package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MyServiceMockingTest {

    /**
     * Exercise 1: Mocking and Stubbing
     * - Create a mock of ExternalApi
     * - Stub its getData() method to return "Mock Data"
     * - Assert that MyService.fetchData() returns the mocked value
     *
     * author T Naveesh
     */

    @Test
    void testMocking() {

        ExternalApi mockApi = mock(ExternalApi.class);

        when(mockApi.getData())
                .thenReturn("Mock Data");

        MyService service = new MyService(mockApi);

        assertEquals(
                "Mock Data",
                service.fetchData());
    }
}