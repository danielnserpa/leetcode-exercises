package leetcode;

public class MaxContainer {

    public int maxContainers (int n, int w, int maxWeight) {

        int containers = maxWeight / w;

        if (containers > (n * n)) {
            containers = n * n;
        }
        return containers;
    }

}
