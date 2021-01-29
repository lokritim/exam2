package exam.department;


public class Department {

	public String deptName;
	public int id;
	public String location;

	public Department() {
		System.out.println("default constructor");
		
	}

	public Department(String deptName ,int id){
		this.deptName=deptName;
		this.id=id;
		System.out.println("2 prametres constructor , departement name : "+ deptName+ ", and id :"+ id);	
	}

	public Department(String deptName,int id,String location){
		
		this.deptName=deptName;
		this.id=id;
		this.location=location;
		System.out.println("3 prametres constructor , departement name : "+ deptName+ ", and id :"+ id + ", and location : "+location);	
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Department d = new Department();
		Department d2 = new Department("eco",2);
		Department d3 = new Department("IT",4,"DC");
		
		
	}

	

}
