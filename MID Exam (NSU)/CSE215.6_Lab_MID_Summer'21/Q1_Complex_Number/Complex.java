class Complex {
	private double real;
	private double imaginary;

	public Complex() {

	}

	public Complex(double real, double imaginary) {
		
		this.real = real;
		this.imaginary = imaginary;
	}
	//logic 
	public Complex add(Complex C2) {
		Complex t = new Complex();
		t.real=this.real+C2.real;
		t.imaginary=this.imaginary+C2.imaginary;
		return t;
	}
	//logic
	public Complex multiply(Complex C2) {
		Complex m = new Complex();
		m.real=(this.real*C2.real)-(this.imaginary*C2.imaginary);
		m.imaginary=(this.real*C2.imaginary)+(this.imaginary*this.real);
		return m;
	}
	
	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImaginary() {
		return imaginary;
	}

	public void setImaginary(double imaginary) {
		this.imaginary = imaginary;
	}

	
	public String toString() {
		return "Complex [real=" + real + ", imaginary=" + imaginary + "]";
	}
	
	
}