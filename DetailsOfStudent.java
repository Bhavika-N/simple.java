class Details{
	String Name;
	String AadharNumber;
	String qualification;
	String State;
	
	Details(String Name,String AadharNumber,String qualification,String State){
		this.Name=Name;
		this.AadharNumber=AadharNumber;
		this.qualification=qualification;
		this.State=State;
	}

public void display(){
	System.out.printf("Name="+Name);
	System.out.printf("AadharNumber="+AadharNumber);
	System.out.printf("Qualification is="+qualification);
	System.out.printf("state="+State);
	}
}

public class DetailsOfStudent {
	public static void main(String[] args) {
		Details obj =new Details("Butter N","1234567","engineering","Pune");
		obj.display();
	}

}
