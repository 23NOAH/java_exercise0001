public class exercise2 {
    /*
    20230303 4장 연습문제
    NOAH
    */

    public static void main(String[] args) {
        //Q1 조건문의 참과 거짓
        System.out.println("Q1 = everywhere");

        //Q2 3의 배수의 합
        int res = 0;
        int i = 1;
        while(i<=1000){
            if((i%3)==0){
                res += i;
            }
            i++;
        }
        System.out.println("Q2= " + res);

        //Q3 별 표시하기
        for(int j= 1; j<6; j++){
            for(int k = 1; k<j+1; k++){
                System.out.print("*");
            }
            System.out.println("");
        }

        //Q4 1부터 100까지 출력하기
        for(int p =1; p<101; p++){
            System.out.println(p);
        }

        //Q5 평균점수 구하기
        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        int result = 0;
        for(int avg :marks){
            result +=avg;
        }
        System.out.println((float)result/marks.length);
    }
}
