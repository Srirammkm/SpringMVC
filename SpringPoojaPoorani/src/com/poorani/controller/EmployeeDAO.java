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
	/*public int save(Student p){    
	    String sql="insert into Emp99(username,userpass) values('"+p.getName()+"',"+p.getPass()+")";    
	    return template.update(sql);    
	}
	public List<Student> getStudents(){    
	    return template.query("select * from Emp99",new RowMapper<Student>(){    
	        public Student mapRow(ResultSet rs, int row) throws SQLException {    
	            Student e=new Student();    
	            e.setName(rs.getString(1));    
	            e.setPass(rs.getInt(2));     
	            return e;    
	        }    
	    });}
	    */
	public int savee(Student p){    
	    String sqll="insert into Emp100(empid,fname,lname) values("+p.getIdd()+",'"+p.getFfname()+"','"+p.getLlname()+"')";    
	    return template.update(sqll);    
	}  
	public int delete(Integer idd){    
	    String sqli="delete from Emp100 where empid='"+idd+"'";    
	    return template.update(sqli);    
	}   
	public int update(Student p){    
	    String sql="update Emp100 set empid="+p.getIdd()+",fname='"+p.getFfname()+"',lname='"+p.getLlname()+"' where empid="+p.getIdd()+"";    
	    return template.update(sql);    
	}  
	
	public Student getEmpById(Integer idd){    
	    String sql="select * from Emp100 where empid=?";    
	    return template.queryForObject(sql, new Object[]{idd},new BeanPropertyRowMapper<Student>(Student.class));    
	}    
	
	    public List<Student> getStudentss(){    
		    return template.query("select * from Emp100",new RowMapper<Student>(){    
		        public Student mapRow(ResultSet rs, int row) throws SQLException {    
		            Student ee=new Student();       
		            ee.setIdd(rs.getInt(1));   
		            ee.setFfname(rs.getString(2)); 
		            ee.setLlname(rs.getString(3)); 
		            return ee;    
		        }    
		    });    
}}