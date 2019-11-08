package com.prolog.SpringJdbc1;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import beans.Person;
@Repository
public class PersonJdbc {
 @Autowired
  private JdbcTemplate jdbctemplate;
	public List<Person> findAll(){
		return jdbctemplate.query("SELECT * FROM PERSON",new BeanPropertyRowMapper(Person.class));
	}
	public List<Person> findById(int id){
		return jdbctemplate.query("SELECT * FROM PERSON WHERE ID=?",new Object[] {id}, new BeanPropertyRowMapper(Person.class));
	}
	public int deleteById(int id){
		return jdbctemplate.update("DELETE  FROM PERSON WHERE ID=?", new Object[] {id});
	}
	public Object insert(Person person) {
		return jdbctemplate.update("INSERT INTO PERSON(ID,NAME,ADDRESS,DATEOFBIRTH) VALUES (?,?,?,?)",
				new Object[] {person.getId(),person.getName(),person.getAddress(),person.getDateOfBirth()});
	}
	public Object update(Person person) {
		return jdbctemplate.update("UPDATE PERSON SET NAME=?,ADDRESS=?,DATEOFBIRTH=? WHERE ID=?",
				new Object[] {person.getName(),person.getAddress(),person.getDateOfBirth(),person.getId()});
	}
}
