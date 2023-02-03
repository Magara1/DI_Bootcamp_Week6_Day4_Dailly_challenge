 package Calculator;

class Calculator {
  // write class fields here
	
	private double num1;
	
	private double num2;

  public Calculator(double num1, double num2) {
    //write definition here
	  super();
	  this.num1 = num1;
	  this.num2 = num2;
  }

  public double add() {
    //write definition here

    return num1 + num2;
  }

  public double subtract() {
	  
    //write definition here
	  
	  return num1 - num2;
  }

  public double multiply() {
    //write definition here

    return  num1*num2;
  }

  public double divide() {
    //write definition here

    return  num1/num2;
  }

}
