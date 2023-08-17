package com.marmodpro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
     @Bean("id1")
	public void getEmployee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter EmpNAmes ...");
		List<String>empNames=new ArrayList<>();
		for(int i=0;i<5;i++) {
			String name=sc.next();
		   empNames.add(name);
		}
		for(String empName:empNames) {
			System.out.println(empName);
		}
		
		System.out.println("Enter emIds...");
		Set<Integer>empId=new HashSet<>();
		for(int i=0;i<5;i++) {
			Integer id=sc.nextInt();
			empId.add(id);
			System.out.println(empId);
		}
		
	System.out.println("Enter Map Destignation...");
	Map<String, Integer>desgDetails=new HashMap<>();
	for(int i=0;i<5;i++) {
		String names=sc.next();
		Integer ids=sc.nextInt();
		
	desgDetails.put(names, ids);
	
	}
	for(Map.Entry<String, Integer>entry:desgDetails.entrySet()){
		System.out.println(entry.getKey()+" "+ entry.getValue());
	}
		
	}
}
