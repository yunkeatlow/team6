
public class SalesEmployee extends Employee {
	private float variableComponent;
	public SalesEmployee (String name, float salary, 
float commissionRate, int salesMade){
		super(name, salary);
		this.variableComponent = salesMade * commissionRate;
	}
	private float variableComponent() {
		return variableComponent;
	}
	public  float computeSalary(){
		return (getBaseSalary() 
- computeDeductions() + variableComponent());
	}
}
