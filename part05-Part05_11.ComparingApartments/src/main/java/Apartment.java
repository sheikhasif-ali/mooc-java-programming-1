
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if(this.squares>compared.squares) {
            return (true);
        } else {
            return false;
        }
    
    }

    public int priceDifference(Apartment compared) {
        int main = this.squares*this.princePerSquare;
        int comp = compared.squares*compared.princePerSquare;
        int ans = 0;

        if(main-comp>0) {
            ans = main-comp;
            return ans;
        }else if(main-comp<0) {
            ans = (main-comp)*-1;
            return ans;
        }else {
            return ans;
        }
    }
    public boolean moreExpensiveThan(Apartment compared) {
        if(this.returnPrice()>compared.returnPrice()) {
            return true;
        } else {
            return false;
        }
    }

    public int returnPrice() {
        return this.squares*this.princePerSquare;
    }

}
