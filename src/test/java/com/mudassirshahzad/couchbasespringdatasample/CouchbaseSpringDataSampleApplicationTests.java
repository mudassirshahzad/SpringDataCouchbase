package com.mudassirshahzad.couchbasespringdatasample;

import com.mudassirshahzad.repositories.BuildingRepository;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CouchbaseSpringDataSampleApplicationTests {

    @Autowired
    protected BuildingRepository businessUnityRepository;

    @Before
    public void deleteAll(){
        businessUnityRepository.deleteAll();
    }
	@Test
	public void contextLoads() {
	}

}

