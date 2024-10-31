package atividade04Vetores;

public class MediaPorMatriz {

	public float[] notasParaVetor(float[][] notas) {
		
		float[] medias = new float[notas.length];
		float media = 0f;
		
		for(int i = 0; i < notas.length; i++) {
			
			for(int j = 0; j < notas[0].length; j++) {
				
				media += notas[i][j];
				
			}
			
			medias[i] = Float.parseFloat(String.format("%.1f", media/notas[i].length));
			media = 0;
		}
		
		return medias;
		
	}
	
}
