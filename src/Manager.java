
public class Manager extends Employee {
	private float variableComponent;
	public Manager (String name, float salary, 
float variableComponent){
		super (name, salary);
		this.variableComponent = variableComponent;
	}
	public float variableComponent() {
		return variableComponent;
	}
	public float computeSalary() {
		return (getBaseSalary() 
- computeDeductions() + variableComponent());
	}
}

