package FFCA.RelationBuilder;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Node {
	private int id;
	private Set<Node> perants;
	private Set<Node> children;
	private Set<String> Terms;
	private Set<String> Objects;
	
	public Node(int id, String objects, String attributes){
		this.id = id;
		this.Objects = getSet(objects);
		this.Terms = getSet(attributes);	
		perants = new HashSet<Node>();
		children = new HashSet<Node>();
	}
	
	public Set<String> getTerms(){
		return Terms;
	}
	
	private Set<String> getSet(String str){
		return new HashSet<String>(Arrays.asList(str.split(", ")));
	}
	
	public void addChildren(Node child){
		children.add(child);
	}
	
	public Set<Node> getChildren(){
		return children;
	}
		
	public boolean haveChildren(){
		if(children.size()>0) return true;
		else return false;
	}
	
	public void setPerants(Set<Node> Perants){
		for(Node p : Perants){
			p.addChildren(this);
		}	
		this.perants = Perants;
	}
	
	public Set<Node> getPerants(){
		return perants;
	}
		
	public int getID(){
		return id;
	}
	
	public Set<String> getObjects(){
		return Objects;
	}
}
