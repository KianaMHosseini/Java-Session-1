package ir.isc.training;

public class Welcoming {
    public static void main(String[] args) {
        String name = "کیانا"; // نام مورد نظر را اینجا قرار دهید

        switch (name) {
            case "کیانا":
            case "زهرا":
            case "عاطفه":
                System.out.println("سرکار خانم " + name + " به سیستم خوش آمدید");
                break;
            case "امیر":
            case "دانیال":
            case "عماد":
                System.out.println("جناب آقا " + name + " به سیستم خوش آمدید");
                break;
            default:
                System.out.println("اجازه ورود ندارید");
                break;
        }
    }
}
   
