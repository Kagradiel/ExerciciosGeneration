package atividade04Vetores;

public class AverageByMatrix {

	public float[] averageToArray(float[][] grades) {
		
		float[] averages = new float[grades.length];
		float average = 0f;
		
		for(int i = 0; i < grades.length; i++) {
			
			for(int j = 0; j < grades[0].length; j++) {
				
				average += grades[i][j];
				
			}
			
			averages[i] = Float.parseFloat(String.format("%.1f", average/grades[i].length));
			average = 0;
		}
		
		return averages;
		
	}
	
}
