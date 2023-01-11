    package coe318.lab2;

/**
 * ComplexNumber models a complex number expressed in rectangular form (real and
 * imaginary parts). It is an <em>immutable</em> object.
 *
 * Vaishali Jadon
 */
public class ComplexNumber {
//Instance variable declarations
private double realNum;
private double imagNum;
    /**
     * Construct a ComplexNumber given its real and imaginary parts.
     *
     * @param re The real component
     * @param im The imaginary component
     */
    public ComplexNumber(double re, double im) {
//Initialize the instance variables
this.realNum = re; 
this.imagNum = im;
    }

    /**
     * Returns the real component.
     *
     * @return the real
     */
    public double getReal() {
        return realNum;	// Done
    }

    /**
     * Returns the imaginary component.
     *
     * @return the imaginary
     */
    public double getImaginary() {
        return imagNum;	// Done
    }

    /**
     * Returns a new ComplexNumber number that is the negative of <em>this</em>.
     * Note: the original ComplexNumber is <b>NOT</b>
     * modified.
     *
     * @return -this
     */
    public ComplexNumber negate() {
        ComplexNumber neg = new ComplexNumber (0,0); //This should create a temp object to hold the sum
        neg.imagNum = -(this.imagNum); 
        neg.realNum = -(this.realNum);
        return neg; // Done
    }

    /**
     * Returns a new ComplexNumber that is the sum of <em>this</em>	and
     * <em>z</em>. Note: the	original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this + z
     */
    public ComplexNumber add(ComplexNumber z) {
        ComplexNumber add= new ComplexNumber(0, 0); //creating a temp object
        add.realNum = (z.realNum + this.realNum);
        add.imagNum= (z.imagNum + this.imagNum);
        return add;	//Done
    }

    /**
     * Returns a new ComplexNumber that is the difference of <em>this</em>	and
     * <em>z</em>. Note: the	original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this + z
     */
    public ComplexNumber subtract(ComplexNumber z) {
        ComplexNumber dif = new ComplexNumber (0,0);
        dif.realNum = (this.realNum - z.realNum); //( this.realNum - z.realNum);
        dif.imagNum = (this.imagNum - z.imagNum);
        return dif;	//Done
    }

    /**
     * Returns a new ComplexNumber that is the product of <em>this</em> and
     * <em>z</em>. Note: the original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this * z
     */
    public ComplexNumber multiply(ComplexNumber z) {
        ComplexNumber mul = new ComplexNumber(0,0);
        // Will be... (a+bi)*(c+di) = (ac-bd)+(bc+ad)i
        mul.realNum = ((z.realNum*this.realNum)-(z.imagNum*this.imagNum));
        mul.imagNum = (z.imagNum*this.realNum + z.realNum*this.imagNum);
        return mul;	//Done
    }

    /**
     * Returns a new ComplexNumber that is the reciprocal of <em>this</em>.
     * Note: the original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @return 1.0 / this
     */
    public ComplexNumber reciprocal() {
        //if z = x+yi then 1/z = (x-yi)/(x^2+y^2)
        ComplexNumber reci = new ComplexNumber (0,0);
        reci.realNum = (this.realNum/(this.realNum*this.realNum+this.imagNum*this.imagNum));
        reci.imagNum = (this.imagNum/(this.realNum*this.realNum + this.imagNum*this.imagNum));
        return reci;	//Done
    }

    /**
     * Returns a new ComplexNumber that is
     * <em>this</em> divided by <em>z</em>. Note: the original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this / z
     */
    public ComplexNumber divide(ComplexNumber z) {
        //Should be... (a+bi)/(c+di) = (ac+bd)/(c^2+d2)+(bc+ad)i/(c^2+d2)
        ComplexNumber div = new ComplexNumber(0,0);
        div.realNum = ((z.realNum * this.realNum) + (z.imagNum*this.imagNum)) /(z.realNum*z.realNum + z.imagNum*z.imagNum);
        div.imagNum = (z.imagNum*this.realNum + z.realNum*this.imagNum)/(z.realNum*z.realNum+z.imagNum*z.imagNum);
        return div;	//Done
    }

    /**
     * Returns a String representation of
     * <em>this</em> in the format:
     * <pre>
     *	real +-(optional) i imaginary
     * </pre> If the imaginary part is zero, only the real part is converted to
     * a String. A "+" or "-" is placed between the real and imaginary parts
     * depending on the the sign of the imagrinary part.
     * <p>
     * Examples:
     * <pre>
     *	..println(new ComplexNumber(0,0); -> "0.0"
     *	..println(new ComplexNumber(1,1); -> "1.0 + i1.0"
     *	..println(new ComplexNumber(1,-1); -> "1.0 - i1.0"
     * </pre>
     *
     * @return the String representation.
     */
    @Override
    public String toString() {
//DO NOT MODIFY THIS CODE!
        String str = "" + this.getReal();
        if (this.getImaginary() == 0.0) {
            return str;
        }
        if (this.getImaginary() > 0) {
            return str + " + i" + this.getImaginary();
        } else {
            return str + " - i" + -this.getImaginary();
        }
    }
    
}


    