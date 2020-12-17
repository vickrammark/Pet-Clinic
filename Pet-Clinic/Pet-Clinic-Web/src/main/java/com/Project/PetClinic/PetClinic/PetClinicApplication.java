package com.Project.PetClinic.PetClinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.Project.PetClinic.PetClinic.DataSource.FakeDataSource;

@SpringBootApplication
public class PetClinicApplication {

	public static void main(String[] args) {
		
		ApplicationContext context=SpringApplication.run(PetClinicApplication.class, args);
		
		FakeDataSource fakeDataSource=context.getBean(FakeDataSource.class);
		System.out.println("Fake data source = "+fakeDataSource.getPassword()+" ,"+fakeDataSource.getUrl() +", "+fakeDataSource.getUser());
	}

}
