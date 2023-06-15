import java.util.ArrayList;
import java.util.Scanner;

public class Grade {
    private ArrayList<Integer> list;
    private ArrayList<Integer> list50;

    public Grade() {
        list = new ArrayList<>();
        list50 = new ArrayList<>();
    }

    public void add(int number) {
        if (number >= 0 && number <= 100) {
            list.add(number);

        }
        if (number >= 50 && number <= 100) {
            list50.add(number);

        }

    }

    public float average() {
        return (this.totalPoints() / list.size());

    }

    public float average50() {
        if (list50.size() == 0) {
            return -1;
        } else {
            return (this.points50() / list50.size());

        }

    }

    public int totalPoints() {
        int total = 0;
        for (int loop : list) {
            total += loop;
        }
        return total;
    }

    public int points50() {
        int points = 0;
        for (int loop : list50) {
            points += loop;
        }
        return points;
    }

    public float passPercent() {
        return ((float) list50.size() / list.size()) * 100;
    }

    public void printGrade() {
        int rank = 5;
        while (rank != -1) {
            System.out.print(rank + ":");
            if (rank == 5) {
                this.printStar(100, 90);

            } else if (rank == 4) {
                this.printStar(89, 80);

            } else if (rank == 3) {
                this.printStar(79, 70);

            } else if (rank == 2) {
                this.printStar(69, 60);

            } else if (rank == 1) {
                this.printStar(59, 50);

            } else if (rank == 0) {
                this.printStar(49, 0);

            }
            System.out.println("");
            rank--;
        }
    }

    public void printStar(int ul, int ll) {
        for (int loop : list) {
            if (loop >= ll & loop <= ul) {
                System.out.print("*");
            }
        }
    }

    public void startUi(Scanner scanner) {
        System.out.println("Enter point totals, -1 stops: ");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                break;
            } else {
                this.add(input);
            }
        }
    }

}
