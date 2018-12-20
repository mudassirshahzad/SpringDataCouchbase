package com.mudassirshahzad.couchbasespringdatasample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

@SpringBootApplication
@EnableCouchbaseRepositories(basePackages = {"com.mudassirshahzad.repositories"})
@ComponentScan(basePackages = {"com.mudassirshahzad.services"})
public class CouchbaseSpringDataSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CouchbaseSpringDataSampleApplication.class, args);
	}

}

