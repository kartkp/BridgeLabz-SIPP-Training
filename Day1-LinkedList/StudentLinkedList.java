import java.util.Scanner;

class Student {
    int rollno;
    String name;
    int age;
    String grade;
    Student next;

    Student(int rollno, String name, int age, String grade) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

public class StudentLinkedList {
    Student head;

    void addBeg(Student studnt) {
        studnt.next = head;
        head = studnt;
    }

    void addEnd(Student studnt) {
        if (head == null) {
            head = studnt;
            return;
        }
        Student temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = studnt;
    }

    void addPos(Student studnt, int pos) {
        if (pos <= 1 || head == null) {
            addBeg(studnt);
            return;
        }
        Student temp = head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        studnt.next = temp.next;
        temp.next = studnt;
    }

    void delByRoll(int rollno) {
        if (head == null) {
            System.out.println("list empty");
            return;
        }
        if (head.rollno == rollno) {
            head = head.next;
            System.out.println("deleted roll " + rollno);
            return;
        }
        Student temp = head;
        while (temp.next != null && temp.next.rollno != rollno) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("roll " + rollno + " not found");
        } else {
            temp.next = temp.next.next;
            System.out.println("deleted roll " + rollno);
        }
    }

    Student searchRoll(int rollno) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollno == rollno) {
                System.out.println("found " + temp.name + " grade " + temp.grade);
                return temp;
            }
            temp = temp.next;
        }
        System.out.println("roll " + rollno + " not found");
        return null;
    }

    void updatGrade(int rollno, String newGrade) {
        Student s = searchRoll(rollno);
        if (s != null) {
            s.grade = newGrade;
            System.out.println("grade updated for roll " + rollno);
        }
    }

    void showAll() {
        if (head == null) {
            System.out.println("no records");
            return;
        }
        Student temp = head;
        System.out.println("Student Records:");
        while (temp != null) {
            System.out.println("Roll: " + temp.rollno + ", Name: " + temp.name +
                               ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        StudentLinkedList slist = new StudentLinkedList();
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("\n1.AddBeg 2.AddEnd 3.AddPos 4.Del 5.Search 6.UpdateGrade 7.ShowAll 8.Exit");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                case 2:
                case 3:
                    System.out.print("roll: ");
                    int r = sc.nextInt();
                    sc.nextLine();
                    System.out.print("name: ");
                    String n = sc.nextLine();
                    System.out.print("age: ");
                    int a = sc.nextInt();
                    sc.nextLine();
                    System.out.print("grade: ");
                    String g = sc.nextLine();
                    Student s = new Student(r, n, a, g);
                    if (ch == 1) {
                        slist.addBeg(s);
                    } else if (ch == 2) {
                        slist.addEnd(s);
                    } else {
                        System.out.print("pos: ");
                        int p = sc.nextInt();
                        slist.addPos(s, p);
                    }
                    break;
                case 4:
                    System.out.print("roll to del: ");
                    int d = sc.nextInt();
                    slist.delByRoll(d);
                    break;
                case 5:
                    System.out.print("roll to search: ");
                    int sr = sc.nextInt();
                    slist.searchRoll(sr);
                    break;
                case 6:
                    System.out.print("roll to update grade: ");
                    int ur = sc.nextInt();
                    sc.nextLine();
                    System.out.print("new grade: ");
                    String ng = sc.nextLine();
                    slist.updatGrade(ur, ng);
                    break;
                case 7:
                    slist.showAll();
                    break;
                case 8:
                    System.out.println("bye");
                    break;
                default:
                    System.out.println("invalid");
            }
        } while (ch != 8);
        sc.close();
    }
}
