public class A implements C {
	
	public void Intro() {
		System.out.println("Let me introduce my BMW.");
	}
	
	public void Start() {
		System.out.println ("BMW is starting now.");
		System.out.println ("Here we go!");
	}
	
	public void Stop() {
		System.out.println("BMW is stopping now.");
	}
	
	public void SetSpeed(int pSpeed) {
		System.out.println("BMW is changing speed to" + pSpeed + "miles/hour now");		
	}
	
	public void Turn (int pDgree) {
		System.out.println("BMW is turning speed to" + pDgree + "degree now");		
	}
}
