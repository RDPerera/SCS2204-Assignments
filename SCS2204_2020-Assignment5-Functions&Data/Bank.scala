object BankAccounts extends App {

  class Account(Id: String, No: Int, Bal: Double) {
    val NIC: String = Id
    val AccNo: Int = No
    var Balance: Double = Bal

    override def toString: String = "[" + NIC + ":" + AccNo + ":" + Balance + "]"

    def withdraw(amount: Double): Unit = this.Balance -= amount

    def deposit(amount: Double): Unit = this.Balance += amount

    def transfer(account: Account, amount: Double): Unit = {
      this.withdraw(amount)
      account.deposit(amount)
    }
  }

  var ACC1 = new Account(Id = "982341060V", No = 14789, Bal = 5000)
  var ACC2 = new Account(Id = "987784514V", No = 14790, Bal = -1000)
  var ACC3 = new Account(Id = "987815454V", No = 14791, Bal = 6500)

  val bank: List[Account] = List[Account](ACC1, ACC2, ACC3)

  val find = (Id: String, bank: List[Account]) => bank.filter(AC => AC.NIC.equals(Id))
  val overdraft = (bank: List[Account]) => bank.filter(AC => AC.Balance < 0)
  val totalBalance = (bank: List[Account]) => bank.reduce((AC1, AC2) => new Account("", 0, AC1.Balance + AC2.Balance)).Balance
  val interest = (bank: List[Account]) => bank.map(AC => if (AC.Balance >= 0) AC.Balance * 1.05 else AC.Balance * 1.1)
  val balanceWithInterest = (interests: List[Double]) => interests.reduce((interest1, interest2) => interest1 + interest2)


  println("Accounts with negative balances :" + overdraft(bank).toString())
  println("Sum of all account balances :" + totalBalance(bank))
  println("Final balances of all accounts after apply the interest function :" + balanceWithInterest(interest(bank)))
}
