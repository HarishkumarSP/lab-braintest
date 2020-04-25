package service;

public class PersonalityCalculator{
	
	public String findYourBrainType(String options) {
		int[] answer = findPersonality(options);
		int q=5;
		int A=0,B=0;
		A= answer[0]+answer[1]+answer[2]+answer[4]+answer[7]+answer[9]+answer[10]+answer[11]+answer[13]+answer[17]+answer[19];
		B= answer[3]+answer[5]+answer[6]+answer[8]+answer[12]+answer[14]+answer[15]+answer[16]+answer[18];		
		int braintype= 66-A+B;
		if(braintype>=20 && braintype<=55)
		{
			return  "leftbrained";
		}
		else if(braintype>=56 && braintype<=64)
		{
			return "noclearpreference";
		}
		else
		{
			return "rightbrained";
		}
		
	}

	public int[] findPersonality(String options) {
		String[] selectedAnswer = options.split(",");
		int[] answer = new int[selectedAnswer.length];
		for(int i=0; i<selectedAnswer.length; i++) {
			answer[i] = Integer.parseInt(selectedAnswer[i]);
	}	
		return answer;
	}
	
}



	




