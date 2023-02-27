public class exercise1 {
    public static void main(String[] args) {
        int a = 80;
        int b = 75;
        int c = 55;

        System.out.println("Q1 : "+(a+b+c)/3);

        int num = 13;
        if(num/2 == 0){
            System.out.println("Q2 : 짝수입니다.");
        }else {
            System.out.println("Q2 : 홀수입니다.");
        }

        String pin = "881120-1068234";
        System.out.println("Q3 : "+pin.substring(0,6));
        System.out.println("Q3 : "+pin.substring(7,14));

        System.out.println("Q3 : "+pin.substring(7,8));

        int flag = Integer.parseInt(pin.substring(7,8));
        if(flag==1){
            System.out.println("Q4 : 남자입니다.");
        }else{
            System.out.println("Q4 : 여자입니다.");
        }

        String abcd = "a:b:c:d";
        System.out.println(abcd.replace(":","#"));
    }
}
