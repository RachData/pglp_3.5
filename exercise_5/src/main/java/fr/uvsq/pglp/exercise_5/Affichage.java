package fr.uvsq.pglp.exercise_5;
import java.time.LocalDateTime;

public class Affichage implements Affiche{

	@Override
	public void Affich(String text) {
		// TODO Auto-generated method stub
		System.out.println(LocalDateTime.now() +" "+text);
		
	}

}
