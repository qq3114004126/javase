class Card {
    int num;
    String name;
    int balance = 0;
    int depositLogIndex = 0;
    String[] depositLog = new String[3];
    int withDrawIndex = 0;
    String[] withDrawLog = new String[3];
    public int getNum() {
	return num;
    }

    public void setNum(int num) {
	this.num = num;
    }

    public int getBalance() {
	return balance;
    }

    // public void setBalance(int balance) {
    // this.balance = balance;
    // }
    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }
    public void deposit(int a) {// 存钱
	this.balance += a;
	if(depositLogIndex < 3) {
	    depositLog[depositLogIndex] = "存钱" + a + "元";
	}
	depositLogIndex++;
	this.chek();
    }

    public void withDraw(int b) {// 取钱
	if (this.balance < b) {
	    System.out.println("余额不足");
	} else {
	    this.balance -= b;
	    if(withDrawIndex < 3) {
		withDrawLog[withDrawIndex] = "取钱" + b + "元";
		}
	    withDrawIndex++;
	    this.chek();
	}
    }

    public void chek() {
	System.out.println("用户名: " + this.name + "卡号:" + this.num + "余额:" + this.balance);
    }
}

class ATM  {
    Card c;

    ATM(Card card) {
	this.c = card;
    }
    public void chek() {
	System.out.println("用户名: " + c.name + "卡号:" + c.num + "余额:" + c.balance);
    }
    public void deposit(int a) {// 存钱
//	c.balance += a;
//	c.chek();
	c.deposit(a);
    }

    public void withDraw(int b) {// 取钱
//	if (c.balance < b) {
//	    System.out.println("余额不足");
//	} else {
//	    c.balance -= b;
//	    c.chek();
//	}
	c.withDraw(b);
    }

    public void transfer(int s, Card OtherCard) {
	if (c.balance < s) {
	    System.out.println("余额不足");
	} else {
	    c.withDraw(s); 
	    c.chek();
	}
	OtherCard.balance += s;
	OtherCard.chek();
    }
    public void log(Card card) {
	for(int i = 0;i < card.depositLogIndex;i++) {
	    if(card.depositLog[i] == null) {
		break;
	    }else {
		System.out.println(card.depositLog[i]);
	    }
	}
	for(int i = 0;i < card.withDrawIndex;i++) {
	    if(card.withDrawLog[i] == null) {
		break;
	    }else {
		System.out.println(card.withDrawLog[i]);
	    }
	}
    }
}
