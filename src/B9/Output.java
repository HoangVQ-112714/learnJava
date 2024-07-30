package B9;

import B8.active.Student;

import java.util.Scanner;

public class Output {
//    public static void main(String[] args) {
//        System.out.println("Nhap x = ");
//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            try {
//                int x = sc.nextInt();
//                try {
//                    System.out.println("Ket qua 10/x la: " + 10 / x);
//                    break;
//                } catch (Exception e) {
//                    System.out.println("Loi nha");
//                }
//            } catch (Exception e) {
//                sc.next();
//            }
//        }
//        sc.close();
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        try (sc) {
//            int x = sc.nextInt();
//            System.out.println("run try");
//        } catch (Exception e) {
//            System.out.println("run error");
//        } finally {
//            System.out.println("run finall");
//        }
//    }


//    public static int nhapMaSV() {
//        Scanner sc = new Scanner(System.in);
//        int result = 0;
//        while (true) {
//            System.out.println("Ma sinh vien:");
//            try {
//                result = sc.nextInt();
//                break;
//            } catch (Exception e) {
//                System.out.println("Ma sinh vien khong hop le");
//                sc.next();
//            }
//        }
//        sc.close();
//        return result;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Tien hanh nhap thong tin :");
//        try (sc) {
//            int maSinhVien = nhapMaSV();
//            Student stu = new Student(12, maSinhVien, "haha", 25);
//            System.out.println("Hoan thanh nhap thong tin");
//            System.out.println(stu);
//        }
//        sc.close();
//    }
}
