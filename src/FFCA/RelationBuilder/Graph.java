package FFCA.RelationBuilder;

import java.util.HashMap;

public class Graph {
	private Node Head;
	private int idConter;
	private HashMap<Integer,Node> GraphMap = new HashMap<Integer,Node>();
	
	public Graph(){
		idConter = 0;
		Head = new Node(idConter,"","");
		GraphMap.put(Head.getID(), Head);
	}
	
	public void addNode(Node node){
		GraphMap.put(node.getID(), node);
	}
	
	public Node getHead(){
		return Head;
	}
	
	public int getID(){
		return ++idConter;
	}
	
	public void PrintRelation_Terms(){
		for(Integer key : GraphMap.keySet()){
			System.out.println("id: " + key
					+ "   Terms:" +  GraphMap.get(key).getTerms().toString());
			System.out.print("perants: { ");
			for(Node node: GraphMap.get(key).getPerants()){

				System.out.print(node.getTerms().toString());
				System.out.print(" ");
			}
			System.out.println("}");
			System.out.print("children: { ");
			for(Node node: GraphMap.get(key).getChildren()){
				System.out.print(node.getTerms().toString());
				System.out.print(" ");
			}	
			System.out.println("}");
			System.out.println("");
		}
	}
	
	public void PrintRelation_ID(){
		for(Integer key : GraphMap.keySet()){
			System.out.println("id: " + key
					+ "   Terms:" +  GraphMap.get(key).getTerms().toString());
			
			System.out.print("perants: { ");
			for(Node node: GraphMap.get(key).getPerants()){

				System.out.print(node.getID());
				System.out.print(" ");
			}
			System.out.println("}");
			
			System.out.print("children: { ");
			for(Node node: GraphMap.get(key).getChildren()){
				System.out.print(node.getID());
				System.out.print(" ");
			}	
			System.out.println("}");
			System.out.println("");
		}
	}
	
	public String getJsonStr(){
		String jsonStr = "";
		return jsonStr;
	}
}
