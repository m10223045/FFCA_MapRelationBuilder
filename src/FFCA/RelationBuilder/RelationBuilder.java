package FFCA.RelationBuilder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RelationBuilder {
	private Graph FFCA_Graph;
	private ArrayList<String> Concepts;
	private String s1 = "objects";
	private String s2 = "attributes";
	
	public RelationBuilder(ArrayList<String> Concepts){
		this.Concepts = Concepts;
		FFCA_Graph = new Graph();
	}
	
	public void BuildRelation(){	
		for(String concept : Concepts){
			Node node = new Node(FFCA_Graph.getID(),ConceptSplit(s1,concept),ConceptSplit(s2,concept));
			node.setPerants(perantsSearch(FFCA_Graph.getHead(),node));
			FFCA_Graph.addNode(node);
		}	
	}
	
	private String ConceptSplit(String Item,String concept){
		if(Item.equals(s1)) return concept.substring(concept.indexOf(s1)+s1.length()+2, concept.indexOf(s2)-3); 
		else if(Item.equals(s2)) return concept.substring(concept.indexOf(s2)+s2.length()+2, concept.length()-1);
		return "";
	}
	
	private Set<Node> perantsSearch(Node graphNode, Node node){
		Set<Node> tempList = new HashSet<Node>();
			
		if(graphNode.haveChildren()){
			for(Node tempNode : graphNode.getChildren()){
				if(node.getTerms().containsAll(tempNode.getTerms())){
					tempList.addAll(perantsSearch(tempNode,node));
				}				
			}		
			if(tempList.size()==0) tempList.add(graphNode); 
		}else{
			tempList.add(graphNode);		
		}
		
		return tempList;
	}
	
	public void PrintResult(){
		//FFCA_Graph.PrintRelation_Terms();
		FFCA_Graph.PrintRelation_ID();
	}
}
