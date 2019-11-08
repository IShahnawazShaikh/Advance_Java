package com.prolog.SpringJdbc1;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import beans.Person;
@SpringBootApplication
public class SpringJdbc1Application implements CommandLineRunner {
    @Autowired
    private PersonJdbc personjdbc;
    private Logger log=LoggerFactory.getLogger(this.getClass());
    public static void main(String[] args) {
		SpringApplication.run(SpringJdbc1Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		List<Person> findAll=personjdbc.findAll();
		log.info("\nAll Person List{}",findAll);
		
		List <Person> findById=personjdbc.findById(2);
		log.info("\nAll Person Based on ID{}",findById);
		
		log.info("\n {} Row affected:",personjdbc.deleteById(3));
		log.info("\nAfter delete data:{}",personjdbc.findAll());
		
		log.info("\n {} Row affected:",personjdbc.insert(new Person(4,"shahnawaz","Delhi",new Date())));	
		log.info("\nAfter insertion new Data:{}",personjdbc.findAll());
		
		log.info("\n {} Row affected:",personjdbc.update(new Person(4,"shahnawaz shaikh","Mumbai",new Date())));	
		log.info("\nAfter insertion new Data:{}",personjdbc.findAll());
	}

}
