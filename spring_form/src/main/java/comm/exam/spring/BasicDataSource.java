package comm.exam.spring;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component("basic")
public class BasicDataSource extends org.apache.commons.dbcp.BasicDataSource {
	
	@PostConstruct
	public void init() {
		setUrl("jdbc:mysql://localhost:3306/mydb");
		setUsername("root");
		setPassword("Sermakani@97");
	}

}
