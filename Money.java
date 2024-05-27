public class Money {

    // instance variables
    private long dollars;
    private long cents;

    // constructor
    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = (long) Math.round((amount - this.dollars) * 100);

    }

    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    // add method
    public Money add(Money other) {
        long totalCents = this.toCents() + other.toCents();
        return new Money(totalCents / 100.0);
    }

    // subtract method
    public Money subtract(Money other) {
        long totalCents = this.toCents() - other.toCents();
        return new Money(totalCents / 100.0);
    }

    // compareTo method
    public int compareTo(Money other) {
        return Long.compare(this.toCents(), other.toCents());
    }

    // equals method
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Money money = (Money) obj;
        return dollars == money.dollars && cents == money.cents;
    }

    // toString method
    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }

    // toCents method
    private long toCents() {
        return dollars * 100 + cents;
    }

}