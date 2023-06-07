
/**
 * 稿费收入税率是20%
 */
public class RoyaltyIncome extends Income {

	public RoyaltyIncome(double income) {
		// TODO Auto-generated constructor stub
		super(income);
	}

	// TODO
	@Override
	public double getTax() {
		// TODO Auto-generated method stub
		return income * 0.2;
	}
}
