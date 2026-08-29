class Main {

    public static void main(String[] args) {

        Main obj = new Main();

        int[] result = obj.distributeCandies(7, 4);

        for (int x : result) {
            System.out.print(x + " ");
        }
    }

    public int[] distributeCandies(int candies, int num_people) {

        int[] ans = new int[num_people];

        int give = 1;
        int person = 0;

        while (candies > 0) {

            if (give <= candies) {
                ans[person] = ans[person] + give;
                candies = candies - give;
            } else {
                ans[person] = ans[person] + candies;
                candies = 0;
            }

            give++;
            person++;

            if (person == num_people) {
                person = 0;
            }
        }

        return ans;
    }
}