package hw.strucrural;

public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        Calculator.Formula sum = target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1);
        sum.calculate(Calculator.Operation.SUM);
        return (int) sum.result();
    }

    @Override
    public int mult(int arg0, int arg1) {
        Calculator.Formula sum = target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1);
        sum.calculate(Calculator.Operation.MULT);
        return (int) sum.result();
    }

    @Override
    public int pow(int a, int b) {
        Calculator.Formula sum = target.newFormula()
                .addOperand(a)
                .addOperand(b);
        sum.calculate(Calculator.Operation.POW);
        return (int) sum.result();
    }
}
