/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathutil;

import static hao.util.MathUtil.computeFactorial;

/**
 *
 * @author nnhao
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("5! = " + computeFactorial(5));
        //tui muốn biết xem 5! chạy đúng ko 
        //vậy tui in kết quả xử lí của hàm ra (actual value)
        //tui so sánh nó coi có bằng 120 mà tui tính trước hok (expected value)
        //nếu hàm có 1 value trả về (actual-giả sử 120)
        //và khớp vs cáci tui cần nó phải thế (expected - giả sử mình cần hàm trả về 120
        //actual khớp vs expected, hàm hạy như mong đợi, hàm chạy đúng
        // testing chẳng qua làm chạy app, chạy hàm, coi kết quả trả về có
        //đugns như mình mong đợi hay ko -  actual và expected là như nhau
        // nếu ko khớp, code có bug, hoặc mình kì vọng sai
        
        // expected: 720 mới chịu nhen
        System.out.println("6! = " + computeFactorial(6));
        
        // expected: 1 mới chịu nhen
        System.out.println("1! = " + computeFactorial(1));
        
        // expected: 1 mới chịu nhen
        System.out.println("0! = " + computeFactorial(0));
        
        // cách test kiều nầy phải:
        //> chuẩn bị data đầu vào, gọi hàm với data đầu vào
        //> tính trước kq trả về (expected)
        //> so sánh kq trả về từ hàm (actual) với expected = mắt
        // tự đưa ra kết luận -> luận hàm bằng mắt
        
        // expected: Exception
        System.out.println("-5! = " + computeFactorial(-5));
        
        //Kĩ thuật dùng mắt đới chiếu kết quả ổn , nhưng ko hiệu quả
        // vì máy có thể đối chiếu dq được luôn mà, máy so đc expected và actualo mà
        //giang hồ đưa ra 1 bộ thư viện, 1 framework giúp mình
        // tự động so sánh 2 kết quả expected và actual
        // framework nầy sẽ tự so sánh và đưa ra màu sắc để hàm ý rằng
        // hàm chạy đúng, màu xanh
        // hàm chạy sai, ko như kì vọng, màu đỏ
        // áp dụng cho 2 loạt data đầu vào
        
        
    }

}
