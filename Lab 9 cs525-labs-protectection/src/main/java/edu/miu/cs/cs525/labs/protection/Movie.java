package edu.miu.cs.cs525.labs.protection;
import java.util.List;

public interface Movie {
	String getTitle();
	void setTitle(String title);
	List<String> getActors();
	void setActors(List<String> actors);
	void comment(String comment);
}