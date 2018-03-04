package two;

public class MoverAndAnimate implements Animatable {

	@Override
	public void move() {
		System.out.println("This animatable can MOVE!");
		
	}

	@Override
	public void animate() {
		System.out.println("This mover can ANIMATE!!");
		
	}

}
