
public class SalaryIncome extends Income{
	
	public SalaryIncome(double income) {
		// TODO Auto-generated constructor stub
		super(income);
	}

	// TODO
	@Override
	public double getTax() {
		// TODO Auto-generated method stub
		return income * 0.1;
	}
}
