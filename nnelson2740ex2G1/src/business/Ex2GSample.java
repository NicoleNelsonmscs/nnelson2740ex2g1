package business;

public class Ex2GSample {
    private int i1;
    private int i2;
    private double d1;
    private double d2;
    private String s1;
    private String s2;

    public Ex2GSample() {
    }

    public Ex2GSample(int i1, int i2, double d1, double d2, String s1, String s2) {
        this.i1 = i1;
        this.i2 = i2;
        this.d1 = d1;
        this.d2 = d2;
        this.s1 = s1;
        this.s2 = s2;
    }

    public int getI1() {
        return i1;
    }

    public void setI1(int i1) {
        this.i1 = i1;
    }

    public int getI2() {
        return i2;
    }

    public void setI2(int i2) {
        this.i2 = i2;
    }

    public double getD1() {
        return d1;
    }

    public void setD1(double d1) {
        this.d1 = d1;
    }

    public double getD2() {
        return d2;
    }

    public void setD2(double d2) {
        this.d2 = d2;
    }

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    @Override
    public String toString() {
        return "Ex2fSample{" +
                "i1=" + i1 +
                ", i2=" + i2 +
                ", d1=" + d1 +
                ", d2=" + d2 +
                ", s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' +
                '}';
    }

    // range test i1: 1 - 10
    public boolean test1() {
        if (this.i1 >= 1 && this.i1 <= 10)
            return true;
        return false;
    }

    // range test: i2< i1< d1
    public boolean test2() {
        if (this.i2 < this.i1 && this.i1 < this.d1)
            return true;
        return false;
    }

    // return smaller value: s1 or s2
    public String test3() {
        int retval = s1.compareToIgnoreCase(s2);
        if (retval < 0)
            return s1;
        return s2;
    }

    // if d1 out of range, return -1 (>0 <= 168)
    // if d2 is out of range, return -1 (>=7.87 <100)
    //calculate regular pay
    //if d1 > 40, calculate overtime pay
    //return total pay
    public Double test4() {
        double totalPay = -1;
        if (this.d1 <= 0 || this.d1 > 168.0)
            return totalPay;
        if (this.d2 < 7.87 || this.d2 > 99.99)
            return totalPay;

        Double regularPay = this.d1 * this.d2;
        Double overtimePay = 0.0;
        if (this.d1 > 40.0) {
            overtimePay = (this.d1 - 40.0) * this.d2 * 0.5;
        }
        totalPay = regularPay + overtimePay;
        return totalPay;
    }

    // same as test 4 but use nested-if and only one return

    public Double test5() {
        Double totalPay = -1.0;
        Double regPay = this.d1 * this.d2;
        Double overtimePay = 0.0;
        if (this.d1 <= 0 || this.d1 > 168.0)
            return totalPay;
        else if (this.d2 < 7.87 || this.d2 > 99.99)
            return totalPay;
        else if (this.d1 > 40.0) {
            overtimePay = (this.d1 - 40.0) * this.d2 * 0.5;
        }
        totalPay = regPay + overtimePay;
        return totalPay;
    }
    // if s1 is not null, use switch to determine if s1: aaaa, bbbb, or cccc

    public boolean test6() {
        boolean a = true;
        boolean b = false;
        if(s1 != null)
         switch (s1){
            case "aaaa":
            case "bbbb":
            case "cccc":
                return a;
            default:
                return b;
        }
        else {
            return b;
        }
    }


}

