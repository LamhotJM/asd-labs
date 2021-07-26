package edu.miu.cs.cs525.labs.protection;

import java.util.List;

public class MovieImpl implements Movie{
    

    private String title;

  

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
  
    public MovieImpl(String title) {
		super();
		this.title = title;
	}

	//Empty constructor
  

	@Override
	public List<String> getActors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setActors(List<String> actors) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comment(String comment) {
		// TODO Auto-generated method stub
		
	}
}
