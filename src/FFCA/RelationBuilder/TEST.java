package FFCA.RelationBuilder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// text1();
		// text2();
		text3();
		
	}
	
	public static void text3(){
		ArrayList<String> testAL = new ArrayList<String>();
		testAL.add("objects:[d1, d2, d3, d4, d5], attributes:[奔喪]");
		testAL.add("objects:[d1, d2, d3, d4], attributes:[奔喪, 陳水扁]");
		testAL.add("objects:[d1, d2, d4], attributes:[奔喪, 監獄, 陳水扁]");
		testAL.add("objects:[d2, d4, d5], attributes:[台北, 奔喪]");
		testAL.add("objects:[d2, d4], attributes:[台北, 奔喪, 監獄, 陳水扁]");
		testAL.add("objects:[d3], attributes:[奔喪, 岳母, 陳水扁]");
		testAL.add("objects:[], attributes:[台北, 奔喪, 岳母, 監獄, 陳水扁]");
		//testAL.add("objects:[d1, d2, d3, d4, d5], attributes:[吃飯]");
		//testAL.add("objects:[d1, d2, d3, d4, d5], attributes:[睡覺]");
		//testAL.add("objects:[d1, d2, d3, d4, d5], attributes:[吃飯, 奔喪, 台北, 奔喪, 岳母, 陳水扁]");
		
		RelationBuilder rb = new RelationBuilder(testAL);
		rb.BuildRelation();
		rb.PrintResult();
	}
	
	public static void text2(){
		String s1 = "objects";
		String s2 = "attributes";
		String str = "objects:[d1, d2, d3, d4, d5], attributes:[奔喪]";
		System.out.println("object: " + str.indexOf("objects"));
		System.out.println("object: " + str.indexOf("attributes"));
		System.out.println("object: [" + str.substring(str.indexOf(s1)+s1.length()+2, str.indexOf(s2)-3) +"]");
		System.out.println("attributes: [" + str.substring(str.indexOf(s2)+s2.length()+2, str.length()-1)+"]");		
	}
	
	public static void text1(){
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(1);
		v1.add(2);
		v1.add(3);
		
		Vector<Integer> v2 = new Vector<Integer>();
		v2.add(1);
		v2.add(2);
		v2.add(3);
		
		Vector<Integer> v3 = new Vector<Integer>();
		v3.add(3);
		v3.add(2);
		v3.add(1);
		
		Vector<Integer> v4 = new Vector<Integer>();
		v4.add(5);
		v4.add(6);
		v4.add(7);
		
		System.out.println("v1 equal to v2 is " + (v1==v2));
		System.out.println("v1 equal to v3 is " + (v1==v3));
		System.out.println("v1 equal to v4 is " + (v1==v4));
		
		Set<String> s1 = new HashSet<String>();
		s1.add("1");
		s1.add("2");
		s1.add("3");
		
		Set<String> s2 = new HashSet<String>();
		s2.add("1");
		s2.add("2");
		s2.add("3");
		
		Set<String> s3 = new HashSet<String>();
		s3.add("3");
		s3.add("2");
		s3.add("1");
		
		Set<String> s4 = new HashSet<String>();
		s4.add("5");
		s4.add("6");
		s4.add("7");
		
		Set<String> s5 = new HashSet<String>();
		s5.add("3");
		s5.add("2");
		
		System.out.println("s1 equle to s2 is " + (s1.equals(s2)));
		System.out.println("s1 equle to s3 is " + (s1.equals(s3)));
		System.out.println("s1 equle to s4 is " + (s1.equals(s4)));
		System.out.println("s1 equle to s5 is " + (s1.containsAll(s5)));
		System.out.println("s5 equle to s1 is " + (s5.containsAll(s1)));
		System.out.println("s1 contains 3 " + (s1.contains("1")));	
	}
}
