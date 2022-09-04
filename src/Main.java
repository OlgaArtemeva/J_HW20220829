public class Main {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;
        int num = num1;
//        String div="";
        int div2=2;
        int div3=3;
        String rez = "";
        String rez2 = "делится на 2";
        String rez3 = "делится на 3";

        if (num1 < num2) {
            while (num <= num2) {
                if (num%div2==0) {
                    rez = rez2;
                }
                else if (num%div3==0) {
                    rez = rez3;
                }
                    System.out.printf("%d %s%n", num, rez);
                    num = num + 1;
                    rez = "";
            }
        } else {
            while (num >= num2) {
                    if (num%div2==0) {
                        rez = rez2;
                    }
                    else if (num%div3==0) {
                        rez = rez3;
                    }

                    System.out.printf("%d %s%n", num, rez);
                    num = num - 1;
                    rez = "";
            }
        }


        System.out.println("/----------------------------------/");

    }

}
