package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class MyServiceVerifyTest {

    /**
     * Exercise 2: Verifying Interactions
     * - Create a mock of ExternalApi
     * - Inject it into MyService
     * - Call fetchData()
     * - Verify that getData() was called on the mock
     *
     * author T Naveesh
     */

    @Test
    void testVerify() {

        ExternalApi mockApi = mock(ExternalApi.class);

        when(mockApi.getData())
                .thenReturn("Mock Data");

        MyService service = new MyService(mockApi);

        service.fetchData();

        verify(mockApi).getData();
    }
}