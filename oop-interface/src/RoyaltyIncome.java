
/**
 * 稿费收入税率是20%
 */
public class RoyaltyIncome implements Income{
	// TODO
	private double income;
	RoyaltyIncome(double income) {
		this.income = income;
	}
	
	@Override
	public double getTax() {
		// TODO Auto-generated method stub
		
		return income * 0.2;
	}
	
}
