package comm.example.p1;

public class TennisCoach implements Coach {
	private String name;
	private Level level;
public TennisCoach()
{
	super();
}

public String getDailyWorkout()
{
	return "practice";
	
}
public void createCoach(String name,Level level)
{
	this.name=name;
	this.level=level;
	
}
public String getCoachDetails()
{
	StringBuilder sb=new StringBuilder();
	sb.append("todays workout"+getDailyWorkout()+"\n");
	sb.append("Name"+getName()+"\n");
	sb.append("level"+level+"\n");
	sb.append("rank"+level.getLevelCode()+"\n");
	return sb.toString();	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Level getLevel() {
	return level;
}

public void setLevel(Level level) {
	this.level = level;
}


}
