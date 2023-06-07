
public class SalaryIncome implements Income {

	// TODO
	private double income;

	public SalaryIncome(double income) {
		// TODO Auto-generated constructor stub
		this.income = income;
	}

	@Override
	public double getTax() {
		// TODO Auto-generated method stub
		return income < 5000 ? 0 : income * 0.2;
	}
}
