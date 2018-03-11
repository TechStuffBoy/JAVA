package com;

class StaticStudent {
	int rollNo;
	String name;
	static String clgName = "IIPM";
	
	public StaticStudent(int iRollNo, String iName) {
		rollNo = iRollNo;
		name = iName;
	}
	static void changeCollege(String iCollege){
		clgName = iCollege;
	}
	void displyInfo(){
		System.out.println("RollNo= " + rollNo + " name=" 
				+ name + " clgName=" + clgName);
	}
	//Static method to calculate square of no
	static int calculateSquare(int no) {
		return no*no;
	}
}
public class StaticMethod {

	public static void main(String[] args) {
		StaticStudent nandhu = new StaticStudent(123,"Nandhu");
		nandhu.displyInfo();
		StaticStudent.changeCollege("IIT");
		nandhu.displyInfo();
		System.out.println("Square of 48 = " + StaticStudent.calculateSquare(48)); 
		
	}

}

/*
There are two main restrictions for the static method. They are:
1) The static method can not use non static data member or call non-static method directly.
2) this and super cannot be used in static context.
*/
