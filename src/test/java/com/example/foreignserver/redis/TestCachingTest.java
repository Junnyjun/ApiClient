package com.example.foreignserver.redis;

import static org.junit.jupiter.api.Assertions.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.CacheManager;

@SpringBootTest
class TestCachingTest {


    @Autowired
    TestCaching testCaching;

    @Autowired
    CacheManager cacheManager;

    @Autowired
    ObjectMapper objectMapper;
    @Test
    void adfs(){
        List<Modele> test = testCaching.test(1);

        System.out.println("test = " + test);
        List<Modele> test2 = testCaching.test(1);
        System.out.println("test = " + test);
    }
}