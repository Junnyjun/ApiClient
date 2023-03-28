package com.example.foreignserver.redis;

import java.util.List;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class TestCaching {


    @Cacheable(key = "#id",value = "test")
    public List<Modele> test(Integer id) {
        System.out.println("NOT CACHED");
        return List.of(
            new Modele("test0"+id, "test1"+id, "test2"+id, "test3"+id),
            new Modele("test4"+id, "test5"+id, "test6"+id, "test7"+id),
            new Modele("test8"+id, "test9"+id, "test10"+id, "test11"+id)
        );
    }

}
