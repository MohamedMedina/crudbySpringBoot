package io.medina.SpringBootStarter.topics;

public class GetTopics {
	
	public GetTopics() {
	
	}


	public GetTopics(int id, String name, String deccription) {
		super();
		this.id = id;
		this.name = name;
		this.deccription = deccription;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeccription() {
		return deccription;
	}
	public void setDeccription(String deccription) {
		this.deccription = deccription;
	}
	private int id;
	private String name;
	private String deccription;
	
		
	
	
}
