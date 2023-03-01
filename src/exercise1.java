import java.util.*;

/*
20230301 3장 연습문제
NOAH
 */
public class exercise1 {

    enum CoffeeType{
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    };

    static void printCoffeePriceAdvanced(CoffeeType type){
        HashMap<CoffeeType,Integer> priceMap = new HashMap<>();
        priceMap.put(CoffeeType.AMERICANO, 3000);
        priceMap.put(CoffeeType.ICE_AMERICANO, 4000);
        priceMap.put(CoffeeType.CAFE_LATTE, 5000);

        int price = priceMap.get(type);
        System.out.println(String.format("가격은 %d원 입니다.", price));

    }
    static void printCoffeePrice(int type){
        HashMap<Integer, Integer> priceMap = new HashMap<>();
        priceMap.put(1, 3000); // 1: 아메리카노
        priceMap.put(2, 4000); // 2: 아이스 아메리카노
        priceMap.put(3, 5000); // 3: 카페라떼

        int price = priceMap.get((type));
        System.out.println(String.format("가격은 %d원 입니다.", price));
    }
    public static void main(String[] args) {

        //Q1 평균점수 구하기
        int a = 80;
        int b = 75;
        int c = 55;

        System.out.println("Q1 : "+(a+b+c)/3);

        //Q2 홀수 짝수 판별
        int num = 13;
        if(num/2 == 0){
            System.out.println("Q2 : 짝수입니다.");
        }else {
            System.out.println("Q2 : 홀수입니다.");
        }

        //Q3 주민등록번호 나누기
        String pin = "881120-1068234";
        System.out.println("Q3 : "+pin.substring(0,6));
        System.out.println("Q3 : "+pin.substring(7,14));

        System.out.println("Q3 : "+pin.substring(7,8));

        //Q4 주민등록번호 인덱싱
        int flag = Integer.parseInt(pin.substring(7,8));
        if(flag==1){
            System.out.println("Q4 : 남자입니다.");
        }else{
            System.out.println("Q4 : 여자입니다.");
        }

        //Q5 문자열 바꾸기
        String abcd = "a:b:c:d";
        System.out.println("Q5 : "+abcd.replace(":","#"));

        //Q6 리스트 역순 정렬하기
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1,3,5,4,2));
        System.out.println(myList);
        myList.sort(Comparator.reverseOrder());
        System.out.println("Q6 : "+myList);

        //Q7 리스트 문자열로 만들기
        ArrayList<String> myList7 = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        System.out.println(myList7);

        String result = String.join(" ", myList7);
        System.out.println("Q7 : "+result);

        //Q8 맵에서 값 추출하기
        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);

        int res = grade.remove("B");
        System.out.println("Q8 : "+ res);
        System.out.println("Q8 : "+ grade);

        //Q9 중복 숫자 제거하기
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,1,2,2,3,3,3,4,4,5));
        HashSet<Integer> temp = new HashSet(numbers);
        ArrayList<Integer> res9 = new ArrayList<>(temp);
        System.out.println("Q9 : "+res9);

        //Q10 매직넘버 제거하기
        printCoffeePrice(1);
        //printCoffeePrice(99);

        System.out.println("Q10 : ");
        printCoffeePriceAdvanced(CoffeeType.AMERICANO);

    }


}
