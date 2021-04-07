public class al {

    public static int Lsearch(int[] dataArray, int search) {
        for (int i = 0; i < dataArray.length; i++) {
            if (dataArray[i] == search)
            return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] dataArray = {4,2,3,5,1}; // 리스트로 만든다.
        int search = 5; // 찾을 값
        int result = Lsearch(dataArray, search);

        if (result == -1) {
            System.out.println("찾지 못했습니다.");
        } else {
            System.out.println(result + "번쨰의 요소가 일치");
        }
    }
}
