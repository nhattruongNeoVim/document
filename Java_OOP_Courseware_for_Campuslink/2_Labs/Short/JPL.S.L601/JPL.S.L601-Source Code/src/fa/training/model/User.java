/**
 * 
 */
package fa.training.model;

/**
 * @author hoabt2
 *
 */
public class User {
	private String name;
	private Float salary;
	private int age;
	
	/**
	 * @param name
	 * @param salary
	 * @param age
	 */
	public User(String name, float salary, int age) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the salary
	 */
	public Float getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}		
}
