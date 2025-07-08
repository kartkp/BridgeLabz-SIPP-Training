import java.util.Scanner;

class Movie {
    String title;
    String director;
    int year;
    double rating;
    Movie next, prev;

    Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}

public class MovieLinkedList {
    Movie head, tail;

    void addBeg(Movie mov) {
        if (head == null) {
            head = tail = mov;
            return;
        }
        mov.next = head;
        head.prev = mov;
        head = mov;
    }

    void addEnd(Movie mov) {
        if (head == null) {
            head = tail = mov;
            return;
        }
        tail.next = mov;
        mov.prev = tail;
        tail = mov;
    }

    void addPos(Movie mov, int pos) {
        if (pos <= 1 || head == null) {
            addBeg(mov);
            return;
        }
        Movie temp = head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        mov.next = temp.next;
        mov.prev = temp;
        if (temp.next != null) {
            temp.next.prev = mov;
        } else {
            tail = mov;
        }
        temp.next = mov;
    }

    void delByTitle(String ttl) {
        if (head == null) {
            System.out.println("list empty");
            return;
        }
        Movie temp = head;
        while (temp != null && !temp.title.equals(ttl)) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("title not found");
            return;
        }
        if (temp == head) {
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
        } else if (temp == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
        System.out.println("deleted " + ttl);
    }

    void searchByDirector(String dir) {
        Movie temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.director.equals(dir)) {
                System.out.println("Found: " + temp.title + ", Rating: " + temp.rating);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("no movie with director " + dir);
    }

    void searchByRating(double rat) {
        Movie temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.rating == rat) {
                System.out.println("Found: " + temp.title + ", Director: " + temp.director);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("no movie with rating " + rat);
    }

    void updRating(String ttl, double newRat) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equals(ttl)) {
                temp.rating = newRat;
                System.out.println("updated rating for " + ttl);
                return;
            }
            temp = temp.next;
        }
        System.out.println("title not found");
    }

    void showForward() {
        if (head == null) {
            System.out.println("no movies");
            return;
        }
        Movie temp = head;
        while (temp != null) {
            System.out.println("Title: " + temp.title + ", Dir: " + temp.director +
                               ", Year: " + temp.year + ", Rating: " + temp.rating);
            temp = temp.next;
        }
    }

    void showBackward() {
        if (tail == null) {
            System.out.println("no movies");
            return;
        }
        Movie temp = tail;
        while (temp != null) {
            System.out.println("Title: " + temp.title + ", Dir: " + temp.director +
                               ", Year: " + temp.year + ", Rating: " + temp.rating);
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {
        MovieLinkedList mlist = new MovieLinkedList();
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("\n1.AddBeg 2.AddEnd 3.AddPos 4.Del 5.SearchDir 6.SearchRat 7.UpdRating 8.ShowForw 9.ShowBack 10.Exit");
            ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:
                case 2:
                case 3:
                    System.out.print("title: ");
                    String t = sc.nextLine();
                    System.out.print("director: ");
                    String d = sc.nextLine();
                    System.out.print("year: ");
                    int y = sc.nextInt();
                    System.out.print("rating: ");
                    double r = sc.nextDouble();
                    sc.nextLine();
                    Movie m = new Movie(t, d, y, r);
                    if (ch == 1) {
                        mlist.addBeg(m);
                    } else if (ch == 2) {
                        mlist.addEnd(m);
                    } else {
                        System.out.print("pos: ");
                        int p = sc.nextInt();
                        mlist.addPos(m, p);
                    }
                    break;
                case 4:
                    System.out.print("title to del: ");
                    String td = sc.nextLine();
                    mlist.delByTitle(td);
                    break;
                case 5:
                    System.out.print("director to search: ");
                    String sd = sc.nextLine();
                    mlist.searchByDirector(sd);
                    break;
                case 6:
                    System.out.print("rating to search: ");
                    double sr = sc.nextDouble();
                    mlist.searchByRating(sr);
                    break;
                case 7:
                    System.out.print("title to update: ");
                    String tu = sc.nextLine();
                    System.out.print("new rating: ");
                    double nr = sc.nextDouble();
                    sc.nextLine();
                    mlist.updRating(tu, nr);
                    break;
                case 8:
                    mlist.showForward();
                    break;
                case 9:
                    mlist.showBackward();
                    break;
                case 10:
                    System.out.println("bye");
                    break;
                default:
                    System.out.println("invalid");
            }
        } while (ch != 10);
        sc.close();
    }
}
