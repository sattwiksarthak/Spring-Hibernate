/*    getDailyWorkout()
       ------------>
myApp                BaseBallCoach
       <------------
- app should be configurable.
- easily change the coach for another sport (Hockey, Cricket, Tennis etc.)*/

package com.sattwik.springdemo;

public class BaseBallCoach implements Coach, headCoach {
	// define a private field for dependency
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection
	public BaseBallCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}
	
	@Override
	public String remarks() {
		return "Practice cover drive";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
