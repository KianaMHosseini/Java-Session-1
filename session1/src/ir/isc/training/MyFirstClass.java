package ir.isc.training;

public class MyFirstClass {
	
    public static void main(String[] args) {
        int score = 59; // تعریف متغیر عددی
        char gradeName;

        switch (score / 10) { // استفاده از score/10 برای تعیین محدوده نمره‌ها
            case 10:
            case 9:
                gradeName = 'A';
                System.out.println("نمره شما " + gradeName + "+ است");
                break;
            case 8:
                gradeName = 'B';
                System.out.println("نمره شما " + gradeName + "+ است");
                break;
            case 7:
                gradeName = 'C';
                System.out.println("نمره شما " + gradeName + "+ است");
                break;
            case 6:
                gradeName = 'D';
                System.out.println("نمره شما " + gradeName + "+ است");
                break;
            default:
                System.out.println("قرار می گیرد F نمره شما کمتر از 60 است و در دسته");
                break;
        }
    }
}