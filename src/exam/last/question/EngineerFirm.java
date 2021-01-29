package exam.last.question;

public class EngineerFirm implements Company {

	public int[] income;
	protected int maxSalarie;
	protected int minSalarie;
	protected float averageSalarie;

	EngineerFirm(int n) {

		this.income = new int[n];
	}

	@Override
	public void assignSalaries(int[] salaries) {

		try {

			if (salaries.length != this.income.length) {

				throw new ArraysElementDiffer();
			} else {
				this.income = salaries;
			}

		} catch (Exception ex) {

		}

	}

	@Override
	public void averageSalary() {
		int sum = 0;
		if (this.income.length > 0) {

			try {

				for (int val : this.income) {

					sum = sum +val;
				}
				
				this.averageSalarie=sum/this.income.length;

			} catch (ArrayIndexOutOfBoundsException ex) {

				System.out.println("array is empty");

			}
		}

	}

	@Override
	public void maxSalary() {
		if (this.income.length > 0) {

			try {

				for (int val : this.income) {

					if (val > this.maxSalarie) {
						this.maxSalarie = val;
					}
				}

			} catch (ArrayIndexOutOfBoundsException ex) {

				System.out.println("array is empty");

			}
		}

	}

	@Override
	public void minSalary() {

		if (this.income.length > 0) {

			try {

				this.minSalarie = this.income[0];

				for (int val : this.income) {

					if (val < this.minSalarie) {
						this.minSalarie = val;
					}
				}

			} catch (ArrayIndexOutOfBoundsException ex) {

				System.out.println("array is empty");

			}
		}

	}

	public static void main(String[] args) {

		int[] table = { 30, 100, 3 };

		EngineerFirm e = new EngineerFirm(3);
		e.assignSalaries(table);

		e.maxSalary();
		e.minSalary();
		e.averageSalary();
		System.out.println(e.minSalarie);
		System.out.println(e.maxSalarie);
		System.out.println(e.averageSalarie);

	}

}
