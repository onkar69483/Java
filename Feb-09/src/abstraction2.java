abstract class Remote{
	static int numOfRemotes = 0;
	
	public Remote() {
		// TODO Auto-generated constructor stub
		numOfRemotes++;
	}
	
	void displayRemoteInfo() {
		System.out.println("This is a Remote!");
	}
	
	void displayNumRemotes() {
		System.out.println("Remotes: "+numOfRemotes);
	}
	
	abstract void turnOnDevice();
	abstract void turnOffDevice();
}

abstract class ACRemote extends Remote{
	abstract void increaseTemp();
	abstract void decreaseTemp();
}

abstract class TvRemote extends Remote{
	abstract void increaseVol();
	abstract void decreaseVol();
}

class SamsungAcRemote extends ACRemote{

	@Override
	void increaseTemp() {
		// TODO Auto-generated method stub
		System.out.println("Samsung temp increased!");
	}

	@Override
	void decreaseTemp() {
		// TODO Auto-generated method stub
		System.out.println("Samsung temp decreased!");
	}

	@Override
	void turnOnDevice() {
		// TODO Auto-generated method stub
		System.out.println("Samsung Ac turned on!");
	}

	@Override
	void turnOffDevice() {
		// TODO Auto-generated method stub
		System.out.println("Samsung Ac turned on!");
	}
	
}

class SamsungTvRemote extends TvRemote{

	@Override
	void increaseVol() {
		// TODO Auto-generated method stub
		System.out.println("Samsung volume increased!");
	}

	@Override
	void decreaseVol() {
		// TODO Auto-generated method stub
		System.out.println("Samsung volume decreased!");
	}

	@Override
	void turnOnDevice() {
		// TODO Auto-generated method stub
		System.out.println("Samsung Tv turned on!");
	}

	@Override
	void turnOffDevice() {
		// TODO Auto-generated method stub
		System.out.println("Samsung Tv turned off!");
	}
	
}

public class abstraction2 {
	public static void main(String[] args) {
		SamsungTvRemote s1 = new SamsungTvRemote();
		s1.turnOnDevice();
		s1.increaseVol();
		s1.decreaseVol();
		s1.turnOffDevice();
		
		SamsungAcRemote s2 = new SamsungAcRemote();
		s2.turnOnDevice();
		s2.increaseTemp();
		s2.decreaseTemp();
		s2.turnOffDevice();
		
		Remote r = new SamsungTvRemote();
		r.displayNumRemotes();
	}
}
