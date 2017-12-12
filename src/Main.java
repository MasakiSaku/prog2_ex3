import jp.ac.uryukyu.ie.ex3.pair01.*;
public class Main {
    public static void main(String[] args){


	//Dice dice = new Dice();

	ExDice exdice = new ExDice(5,7);
	for (int i=0; i<10; i++){
			exdice.play();
			System.out.println("exdice"+i+"回目:"+exdice.getValue());
		}

    }
}