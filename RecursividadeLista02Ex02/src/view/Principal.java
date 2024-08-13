package view;

import controller.DivisaoController; 

public class Principal {

	public static void main(String[] args) {
		DivisaoController dc = new DivisaoController();
		
		int dividendo = 23, divisor = 4;
		
		System.out.println(dc.divide(dividendo, divisor));
	}

}
