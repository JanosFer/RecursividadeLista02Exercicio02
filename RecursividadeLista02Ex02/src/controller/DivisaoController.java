package controller;

public class DivisaoController {
	public DivisaoController() {
		super();
	}
	
	public double divide(int dividendo, int divisor) {
		if(dividendo <= divisor) {
			return dividendo;
		}else {
			dividendo -= divisor;
			return divide(dividendo, divisor);
		}
	}
}
