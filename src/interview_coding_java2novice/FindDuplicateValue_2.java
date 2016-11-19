package interview_coding_java2novice;

public class FindDuplicateValue_2 {

    public static void main(String[] args) {
        int ar[] = {1, 22, 33, 2};
        int count = 0;

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                if (ar[i] == ar[j]) {
                    count++;

                }

            }

        }
        if (count > 1) {
            System.out.println("It has duplicate");

        } else {
            System.out.println("It has no duplicate");
        }
    }

}
