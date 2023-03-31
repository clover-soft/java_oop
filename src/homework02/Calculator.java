package homework02;

public class Calculator implements ICalculator {
    private double firstOperand;
    private double secondOperand;
    private String operatorStr;

    public double getFirst() {
        return firstOperand;
    }

    public double getSecond() {
        return secondOperand;
    }

    public void setFirstOperand(String operandStr) {
        firstOperand = Double.parseDouble(operandStr);
    }

    public void setSecondOperand(String operandStr) {
        secondOperand = Double.parseDouble(operandStr);
    }

    public void setOperator(String operatorStr) {
        this.operatorStr = operatorStr;
    }

    public String getResult() {
        IOperation operation = operation(operatorStr);
        double res = operation.calculate(firstOperand, secondOperand);
        return Double.toString(res);
    }

    private IOperation operation(String operatorStr) {
        switch (operatorStr) {
            case "+":
                return (fOp, sOp) -> fOp + sOp;
            case "-":
                return (fOp, sOp) -> fOp - sOp;
            case "*":
                return (fOp, sOp) -> fOp * sOp;
            case "/":
                return (fOp, sOp) -> sOp != 0 ? fOp / sOp : 0;
            default:
                return null;
        }
    }
}
