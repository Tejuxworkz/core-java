package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.xworkz.collectionapp.dto.HairDryerDto;

public class CollectionTester {
	
	double inFreq;
	String adv;
	String subTitle;
	String mailId;
	String additionalSpecification;
	String toolFree;
	

	public static void main(String[] args) {
		List collection = new LinkedList<>();
		
		CollectionTester collection1 = new CollectionTester();
		CollectionTester collection2 = new CollectionTester();
		CollectionTester collection3 = new CollectionTester();
		CollectionTester collection4 = new CollectionTester();
		CollectionTester collection5 = new CollectionTester();
		CollectionTester collection6 = new CollectionTester();
		System.out.println("Hair Dyer Description");
		
		
		collection1.inFreq=1000;
		collection2.adv="Blooming Air";
		collection3.subTitle="For gorgeous hair";
		collection4.mailId="www.vega.co.in";
		collection5.additionalSpecification="1 cool/heat setting";
		collection6.toolFree="toll-free:18008439999";
		
		Collection collection7=new ArrayList<>();
		collection7.add(1000);
		collection7.add(new HairDryerDto());
		
		/*collection.add("VEGA");
		collection.add("Blooming Air");
		collection.add("For gorgeous hair");
		collection.add("www.vega.co.in");
		collection.add("1 cool/heat setting");
		collection.add("toll-free:18008439999");
		collection.addAll(collection7);*/
		
		
		Object[] ob=collection7.toArray();
		for (int i = 0; i < ob.length; i++) {
			Object object = ob[i];
			
		}
		
		//Utility Class:Arrays
		//Arrays.asList(null);
		
		
		/*eg. int a[]={1,2,3};
			List list = Arrays(a);*/
		
		System.out.println(collection.size());
		
		collection.removeAll(collection);
		System.out.println(collection.size());
		
		collection.retainAll(collection);//only when collection data are similar
		System.out.println(collection.size());
		
		System.out.println(collection.equals(collection7));
		
	//	System.out.println(collection.toString());
		
		//collection.removeAll(collection7);
		//System.out.println(collection.contains("chendu"));
		//System.out.println(collection.containsAll(collection7));
		
		
		//1 kind of fetching the data
		collection.forEach(System.out::println);
		
		
		
		System.out.println("---------------------------------------------");
		
		
		//2nd kind of fetching the data
		Iterator itr=collection.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		System.out.println("---------------------------------------------");
		
		for(Object obj:collection) {
		System.out.println(obj);
		}
		
		
		
	
	}
}
