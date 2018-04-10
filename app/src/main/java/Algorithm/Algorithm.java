package Algorithm;

/**
 * Created by liulh on 2018/4/10.
 */

public class Algorithm {

    /**
     * 标号1-n的n个人首尾相接，1到3报数，报到3的退出，求最后一个人的标号
     *
     * @param n 人数量
     * @return 剩下最后一个的人
     */
    public static int lastPerson(int n) {
        if (n <= 1) {
            return n;
        }
        int lastPerson = 0;
        boolean[] personList = new boolean[n];
        for (int i = 0; i < n; i++) {
            personList[i] = true;
        }
        int startPos = 0;
        int count = 0;
        int remainPerson = n;
        while (true) {
            if (personList[startPos]) {
                count++;
            }
            if (count == 3) {
                personList[startPos] = false;
                count = 0;
                remainPerson--;
            }
            if (remainPerson == 1) {
                break;
            }
            startPos++;
            if (startPos == n) {
                startPos = 0;
            }
        }
        //找出这一人
        for (int i = 0; i < n; i++) {
            if (personList[i] == true) {
                lastPerson = i + 1;
            }
        }
        return lastPerson;
    }

    /**
     * TODO 给定一个字符串，求第一个不重复的字符 abbcad -> c
     * 设计思路与 标号1-n的n个人首尾相接，1到3报数，报到3的退出，求最后一个人的标号 相同
     * 声明一个标记数组存放字符串的信息
     */
}
