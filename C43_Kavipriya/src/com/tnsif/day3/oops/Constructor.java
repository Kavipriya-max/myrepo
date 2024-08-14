package com.tnsif.day3.oops;

public class Constructor {
	
	 String name;
     int age;
     String dept;
     
     
      public Constructor()
      {
    	  System.out.println("Default constructor");
      }
      public Constructor(String ConstructorName,int ConstructorAge,String ConstructorDept ) {
    	  this();
    	  System.out.println("Parameterized constructor");
    	  this.name=ConstructorName;
    	  this.age=ConstructorAge;
    	  this.dept=ConstructorDept;
      }
      
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
		//@overide
		public String toString() {
			return "OopsConcept [Name=" + name +" Age =" + age +"  Dept ="+ dept +"]";
					
		}
		 
		
		public static void main(String[] args) {
			//class name  obj name=keyword refer name
		 Constructor obj = new  Constructor();
			obj.setName("kavi");
			obj.setAge(20);
			obj.setDept("CSE");
		   System.out.println(obj);
		    
		}

	 
	}


