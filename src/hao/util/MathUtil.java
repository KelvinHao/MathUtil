/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hao.util;

/**
 *
 * @author nnhao
 */
// đây là class chứa các hàm toán học ta tự viết mục đích là công cụ là sài chung cho mọi nơi
// phân cái gì mà được thiết kế để xài chung ta dùng kĩ thuật STATIC
public class MathUtil {

    // tính !n = 1.2.3....n vì n! tăng rất nhân, sẽ tràn int sớm
    // int chỉ lưu được tối đa 2 tỷ 1, nên mình sxài long an toàn hơn
    // 15! to lắm rồi, tính tối đa 15!
    public static long computeFactorial(int n) {
        //nếu người dùng đưa cả số âm vào tao sẽ ném ra ngoại lệ
        if (n < 0 || n > 15) {
            throw new IllegalArgumentException("Invalid argument!!! n must be >=0 & n <=15");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        // đứa nào sài else ở chỗ nầy trừ điểm
        return n * computeFactorial(n - 1);
        // đệ qui nè, n!= n*(n-1)!
    }
}
