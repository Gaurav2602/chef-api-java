package edu.tongji.wang.model;

import java.util.List;
import java.util.UUID;

public abstract class Instance {
	private String id;
	private String type;
	private String name;
	private String owner;
//	public String 
	private List<Server> servers;
	
	public Instance(String name, String type, String owner){
		this.type = type;
		this.name = name;
		this.owner = owner;
		id = UUID.randomUUID().toString(); 
	}

	public List<Server> getServers() {
		return servers;
	}

	public void setServers(List<Server> servers) {
		this.servers = servers;
	}

	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public String getOwner() {
		return owner;
	}
	
}