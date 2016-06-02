public class FlyingTest {
	public static void main(String[] args)
	
	{
		
		Flyer Bird = new Flyer(10, 3);
		
		Flyer Airplane = new Flyer(450, 50);
		
		Flyer JetPlane = new Flyer(1000, 120);
		
		Flyer Missile = new Flyer(2500, 800);
		
		Flyer Superman = new Flyer(3500, 500);
			
		
		Runnable BirdThread = new FlyingThread(Bird);
		
		Runnable AirplaneThread = new FlyingThread(Airplane);
		
		Runnable JetPlaneThread = new FlyingThread(JetPlane);
		
		Runnable MissileThread = new FlyingThread(Missile);
		
		Runnable SupermanThread = new FlyingThread(Superman);
		
		
		Thread BirdWorker = new Thread(BirdThread);
		
		Thread AirplaneWorker = new Thread(AirplaneThread);
		
		Thread JetPlaneWorker = new Thread(JetPlaneThread);
		
		Thread MissileWorker = new Thread(MissileThread);
		
		Thread SupermanWorker = new Thread(SupermanThread);
		
		
		BirdWorker.setName("Bird");
		
		AirplaneWorker.setName("Airplane");
		
		JetPlaneWorker.setName("JetPlane");
		
		MissileWorker.setName("Missile");
		
		SupermanWorker.setName("Superman");
		
		BirdWorker.start();
		
		AirplaneWorker.start();
		
		JetPlaneWorker.start();
		
		MissileWorker.start();
		
		SupermanWorker.start();
		
	}
}