public class A implements C {
	
	public void owner() {
		System.out.println("Hello I`m the owner of car.");
		System.out.println ("Here we go!");
	}
	
	public void Intro() {
		System.out.println("Let me introduce my BMW.");
		System.out.println ("Here we go!");
		System.out.println ("Here we go!");
	}
	
	public void Start() {
		System.out.println ("BMW is starting now.");
		System.out.println ("Here we go!");
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
