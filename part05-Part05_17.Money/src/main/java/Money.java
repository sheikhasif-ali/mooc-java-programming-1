
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        int euros = this.euros + addition.euros;
        int cents = this.cents + addition.cents;
        Money answer = new Money(euros, cents);
        return answer;
    }

    public boolean lessThan(Money compared) {
        if(this.euros < 0) {
            return true;
        }else if(compared.euros < 0) {
            return false;
        } else {
            int thiss= this.euros*100+this.cents;
            int comp = compared.euros*100 + compared.cents;
            System.out.println(thiss);
            System.out.println(comp);
            if(thiss < comp) {
                return true;
            } else {
                return false;
            }

        }
    }

    public Money minus(Money decreaser) {
        float a = (float)((this.euros*100) + this.cents)/100;
        float b = (float)((decreaser.euros*100) + decreaser.cents)/100;
        float ans = a-b; //2.6
       
        int euros = (int)ans; //2
        
        int cents = (int)Math.round((ans-euros)*100); //2.6-2
        if(euros <= 0 && cents <= 0) {
            euros = 0;
            cents = 0;
            
        } 
        Money answer = new Money(euros, cents);
            return answer;

    }


}
