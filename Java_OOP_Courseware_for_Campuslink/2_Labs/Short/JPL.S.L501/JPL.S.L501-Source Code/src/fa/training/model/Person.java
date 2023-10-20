/**
 * 
 */
package fa.training.model;

/**
 * @author hoabt2
 *
 */
public class Person {
	
	private String name;
    private int age;
	private String email;
	
	
	/**
	 * @param name
	 * @param age
	 * @param email
	 */
	public Person(String name, int age, String email) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
	}  
	
    /**
     * @param name
     * @param age
     */
    public Person(String name, int age) {
		super();
		this.name = name;
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

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}    
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}	
}
