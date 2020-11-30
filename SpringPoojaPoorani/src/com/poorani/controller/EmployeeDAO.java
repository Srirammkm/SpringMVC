package com.poorani.controller;
import java.sql.ResultSet;    
import java.sql.SQLException;    
import java.util.List;    
import org.springframework.jdbc.core.BeanPropertyRowMapper;    
import org.springframework.jdbc.core.JdbcTemplate;    
import org.springframework.jdbc.core.RowMapper;    
import com.poorani.controller.Student;    
public class EmployeeDAO {

	JdbcTemplate template;    
    
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}    
	public int save(Student p){    
	    String sql="insert into Emp99(username,userpass) values('"+p.getName()+"',"+p.getPass()+")";    
	    return template.update(sql);    
	}
	public int delete(String name){    
	    String sqli="delete from Emp99 where username='"+name+"'";    
	    return template.update(sqli);    
	}    
	public List<Student> getStudents(){    
	    return template.query("select * from Emp99",new RowMapper<Student>(){    
	        public Student mapRow(ResultSet rs, int row) throws SQLException {    
	            Student e=new Student();    
	            e.setName(rs.getString(1));    
	            e.setPass(rs.getInt(2));     
	            return e;    
	        }    
	    });    
}}