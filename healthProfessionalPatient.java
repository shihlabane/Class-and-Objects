package ClassObject;

public class HealthProssionalPatient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
       /* 2. Design a class that can be used by a
        health care professional to keep track of a patient’s vital statistics.
        Here’s what the class should do:
       1.  Construct a class called Patient
       2. Store a String name for the patient
       3. Store weight and height for patient as doubles
       4. Construct a new patient using these values
       5. Write a method called BMI which returns the patient’s BMI
        as a double. BMI can be calculated as BMI = 
        ( Weight in Pounds / ( Height in inches x Height in inches ) ) x 703
      6. Next, construct a class called “Patients” and create a main method. Create a Patient object and assign some height and weight to that object. Display the BMI of that patient. 
		 */
		
		
		Patient obj = new Patient();
		obj.name = "Ishmael";
		obj.height = 1.8;
		obj.weight = 65.8;
		
		System.out.print(obj.BMI());
		

	}

}

class Patient{

	String name ="";
	double weight = 0;
	double height =0;
	
	
	public double BMI()
	{
		return (weight/(height * height)) * 703;
	}
	
}
