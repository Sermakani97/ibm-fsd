package comm.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
private Map<String,String>map;
public MapDemo()
{
	super();
	map=new HashMap<String,String>();

}
public void createMap()
{
	map.put("name", "Rahul");
	map.put("address","India");
}
public Set<String> getMapKeys()
{
	return map.keySet();
}

}
