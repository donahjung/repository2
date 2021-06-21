public class B implements C {
	
	public void Intro() {
		System.out.println("Let me introduce my Cadillac.");
		System.out.println ("Here we go!");
	}
	
	public void Start() {
		System.out.println ("Cadillac is starting now.");
	}
	
	public void Stop() {
		System.out.println("Cadillac is stopping now.");
	}
	
	public void SetSpeed(int pSpeed) {
		System.out.println("Cadillac is changing speed to" + pSpeed + "miles/hour now");		
	}
	
	public void Turn (int pDgree) {
		System.out.println("Cadillac is turning speed to" + pDgree + "degree now");		
	}
}
