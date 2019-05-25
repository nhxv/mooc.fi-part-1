public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        if (cents > 99) {
            euros += cents/100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money added) {
        int sumEuros = this.euros + added.euros();
        int sumCents = this.cents + added.cents();
        if (sumCents > 99) {
            sumEuros += sumCents/100;
            sumCents %= 100;
        }
        Money sum = new Money(sumEuros, sumCents);
        return sum;
    }

    public Money minus(Money decremented) {
        if (this.less(decremented)) {
            //set difference value to zero when called object is less than parameter object
            Money difference = new Money(0, 0);
            return difference;
        } else {
            int differenceEuros = this.euros - decremented.euros();
            int differenceCents = this.cents - decremented.cents();
            if (differenceCents < 0) {
                differenceEuros--;
                differenceCents = Math.abs(100 - Math.abs(differenceCents)) % 100;
                Money difference = new Money(differenceEuros, differenceCents);
                return difference;
            }
            Money difference = new Money(differenceEuros, differenceCents);
            return difference;

        }

    }

    public boolean less(Money compared) {
        if (this.euros < compared.euros()) {
            return true;
        } else if (this.euros == compared.euros()) {
            if (this.cents < compared.euros()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
