package com.tnsif.day3.oops;

public class Encapsulation {


        String name;
        int age;
        String dept;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name; //state the current object
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		 
		
		public static void main(String[] args) {
			//class name  obj name=keyword refer name
			Encapsulation obj = new Encapsulation();
			obj.setName("kavi");
			obj.setAge(20);
			obj.setDept("CSE");
		   System.out.println(obj.age);
		}
        
	}


