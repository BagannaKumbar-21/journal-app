package com.learnspringboot.journalApp;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.testng.Assert;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class JournalApplicationTests {
    @Test
    public void shouldTestSomething() {
        //Arrange
        //Act
        //Assert
        Assert.assertEquals(200,200);
    }
}
