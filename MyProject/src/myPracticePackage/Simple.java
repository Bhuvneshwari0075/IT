package myPracticePackage;

class Teacher{  
private String designation="Teacher";
private String collegeName="DegreeCollege";

protected void setDesignation(String designation)
{this.designation=designation;
}
protected void setCollegeName(String collegeName)
{this.collegeName=collegeName;
}
protected  String getDesignation()
{return designation;
}

public String getCollegeName() 
{return collegeName;
}
void does() {System.out.println("teaching");
}
}

public class Simple extends Teacher{
	String mainSubject="Physics";
	public static void main(String args[]) {
		Simple obj=new Simple();
		//System.out.println(obj.designation);
		obj.setCollegeName("Mycollege");
		
		System.out.println(obj.getCollegeName());
		System.out.println(obj.getDesignation());
		System.out.println(obj.mainSubject);
		obj.does();
		
	}
}