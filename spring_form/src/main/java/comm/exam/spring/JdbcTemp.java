package comm.exam.spring;

import javax.annotation.PostConstruct;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("jTemplate")
public class JdbcTemp extends JdbcTemplate
{
	BasicDataSource dataSource;
	@PostConstruct
	public void init() {
		setDataSource(dataSource);
	}
}