public class BankAccount {
    private double amount = 0;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum){
        sum+=amount;
        System.out.println("Вы пополнили счет на: " + sum);
    }
    public void withDraw(int sum) throws IllegalArgumentException{
        if (sum>amount){
            throw new IllegalArgumentException("Ошибка, сумма больше чем остаток.");
        }else {
            sum-=amount;
        }
    }
}
