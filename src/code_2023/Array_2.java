package code_2023;
//문제 설명
//정수 배열 numbers가 매개변수로 주어집니다. numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
//numbers	result
//[1, 2, 3, 4, 5]	[2, 4, 6, 8, 10]
//[1, 2, 100, -99, 1, 2, 3]	[2, 4, 200, -198, 2, 4, 6]

public class Array_2 {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 100, -99, 1, 2, 3};
		int[] answer = new int[numbers.length];
        for(int i=0;i<numbers.length;i++){
            answer[i]=numbers[i]*2;
        }
        System.out.println(answer);

	}

}
