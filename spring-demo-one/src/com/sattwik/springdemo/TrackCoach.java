package com.sattwik.springdemo;

public class TrackCoach implements Coach, headCoach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5km";
	}
	
	@Override
	public String remarks() {
		return "Maintain Stamina";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}
	
	// add an init-method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: Inside doMyStartupStuff");
	}
	
	// add a destroy-method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: Inside doMyCleanupStuff");
	}
	
}
